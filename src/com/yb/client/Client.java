package com.yb.client;

/**
 * @author yebin
 */
public class Client {
    public static void main(String[] args) {
        try {
            System.out.println(Enum.valueOf(VariableUnits.class,"CODE_90001").getCode());
            System.out.println(Enum.valueOf(VariableUnits.class,"FAIL").getCode());
        }catch (IllegalArgumentException e){
            System.out.println("没有默认值");
        }
        //动态获取枚举类

    }
}
