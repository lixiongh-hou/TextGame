package com.sq.common_module.common.utils.gson;

import com.google.gson.Gson;
import com.sq.common_module.common.utils.http.BaseResult;
import com.sq.common_module.common.utils.http.ErrorResult;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Converter;

class MyGsonResponseBodyConverter<T> implements Converter<ResponseBody,T> {
    private final Gson gson;
    private final Type type;

    public MyGsonResponseBodyConverter(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = value.string();
        try {
            BaseResult<?> baseBean = gson.fromJson(response, BaseResult.class);
            if (baseBean.getCode()!=0) {
                ArrayList<String> strings = new ArrayList<>();
                throw new ErrorResult(baseBean.getCode(),strings,baseBean.getMsg());
            }
            return gson.fromJson(response,type);

        }finally {
            value.close();
        }
    }
}
