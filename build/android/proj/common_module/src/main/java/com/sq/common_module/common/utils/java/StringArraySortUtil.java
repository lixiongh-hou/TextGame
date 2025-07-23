package com.sq.common_module.common.utils.java;

import android.text.TextUtils;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by yangshuai on 2017/12/12.
 * <p>
 * string按assic码值排序
 */

public class StringArraySortUtil {
    public static String gtStitchingString(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            String[] array = new String[map.size()];
            int i = 0;
            while (iterator.hasNext()) {
                String key = iterator.next().getKey();
                array[i] = key;
                i++;
            }

            String[] sortArray = StringArraySortUtil.sort(array);
            StringBuffer stringBuffer = new StringBuffer();
            for (int k = 0; k < sortArray.length; k++) {
                String value = map.get(sortArray[k]);
                if (!TextUtils.isEmpty(value)) {
                    stringBuffer.append(value);
              }
            }
            return stringBuffer.toString();
        } else {
            return null;
        }
    }


    public static String[] sort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
