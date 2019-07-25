package com.zyh.java;


import java.util.ArrayList;

public class Helloword {
  p
    public static void main(String[] args) {
        //region 查看代码
        System.out.println("hellowrod");
        //单行注释颜色红色
        /*
         * 多行注释为黄色
         */
        ArrayList lsi = new ArrayList();
        method1();
        //endregion
        int i = 0;
        String[] shuzu = new String[]{"diyige", "dierge"};
        System.out.println("shuzu = " + shuzu);
        for (String s : shuzu) {
            System.out.println(s);
        }


    }

    public static void method1() {

    }

}
