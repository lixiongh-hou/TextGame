package com.sq.common_module.common.net.bean;

public class LoginBean {

    /**
     * code : 0
     * msg :
     * data : {"uid":"23113400","token":"e1720f29e565fbe43f20d3686163fc1c","isCreatedOver24Hours":false,"weatherFocus":0}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * uid : 23113400
         * token : e1720f29e565fbe43f20d3686163fc1c
         * isCreatedOver24Hours : false
         * weatherFocus : 0
         */

        private String uid;
        private String token;
        private boolean isCreatedOver24Hours;
        private int weatherFocus;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public boolean isIsCreatedOver24Hours() {
            return isCreatedOver24Hours;
        }

        public void setIsCreatedOver24Hours(boolean isCreatedOver24Hours) {
            this.isCreatedOver24Hours = isCreatedOver24Hours;
        }

        public int getWeatherFocus() {
            return weatherFocus;
        }

        public void setWeatherFocus(int weatherFocus) {
            this.weatherFocus = weatherFocus;
        }
    }
}
