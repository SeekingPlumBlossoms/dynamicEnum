package com.yb.client;

import java.util.HashMap;

public enum  VariableUnits {
    /**
     * 成功返回之
     */
    CODE_1000("1000","success","0000","这是测试的方法"){
        @Override
        public HashMap<String,String> getMap(){
            HashMap<String,String> hashMap = new HashMap<>(2);
            hashMap.put("result","11111");
            hashMap.put("resultMsg","success");
            return hashMap;
        }
    },
    CODE_90001("90001","","90001","这是测试的方法2"){
        @Override
        public HashMap<String,String> getMap(){
            HashMap<String,String> hashMap = new HashMap<>(2);
            hashMap.put("result","11111");
            hashMap.put("resultMsg","success");
            return hashMap;
        }
    };
     VariableUnits(String code,String msg,String resultCode,String resultMsg){
        this.code=code;
        this.msg=msg;
        this.resultCode=resultCode;
        this.resultMsg=resultMsg;
    }

    /**
     * code
     */
    private String code;
    /**
     * code
     */
    private String msg;
    /**
     * code
     */
    private String resultCode;
    /**
     * code
     */
    private String resultMsg;
    /**
     * code
     */
    public abstract HashMap<String,String> getMap();



    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }
}
