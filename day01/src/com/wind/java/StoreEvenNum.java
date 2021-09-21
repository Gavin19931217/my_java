package com.wind.java;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2021/9/21/021 18:26
 * 功能:查找出1-100之间的偶数
 */
public class StoreEvenNum {
    public void printEvenNumber() {
        //创建一个数组，存储1-100之间的偶数
        int[] array = new int[50];
        //将1-100之间的偶数存入数组内
        for (int i = 0; i <= array.length - 1; i++) {
            //执行50次，从0开始数比较方便
            array[i] = 2 * i + 2;
        }

        System.out.println("1-100之间的偶数：");
        //输出验证
        for (int v : array) {
            System.out.print(v + " ");
        }
    }
}
