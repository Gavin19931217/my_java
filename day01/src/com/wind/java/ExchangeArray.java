package com.wind.java;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2021/9/21/021 18:19
 * 功能：交换两个数组
 */
public class ExchangeArray {
    public void exchangeArr(int[] a, int[] b) {
        //给定两个数组a{1, 2, 3, 4}, b{5, 6, 7, 8}将两个数组内的元素对应位置互换
        //1.创建两个数组
        //int[] a = new int[] {1, 2, 3, 4};
        //int[] b = new int[] {5, 6, 7, 8};
        //2.元素对应位置的互换----每一次交换两个数字，换四次
        //方式一 交换数组中对应的元素（循环次数多，受长度的限制）
        /*for(int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }*/

        //方式二 直接交换变量a和b中的数组引用（地址） 不需要循环就能搞定，不受长度限制
        int[] temp = a;
        a = b;
        b = temp;

        //3.分别输出两个数组元素
        for(int v : a) {//输出a
            System.out.println("数组a:"+v);
        }
        System.out.println("-------------");
        for(int v : b) {//输出b
            System.out.println("数组a:"+v);
        }
    }
}
