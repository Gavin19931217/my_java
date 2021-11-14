package com.wind.java;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2021/10/24/021 15:30
 * 功能：文件流 字符流 数据流 对象流 网络流
 */
public class IOflow {
    public static void main(String[] args) {
//        File file = new File("D://Code//Intellij IDEA//test//haha.txt");  //file对象是堆内存中创建出来的一个对象空间

        //在硬盘上创建一个文件夹
//        boolean value = file.mkdir(); //外层父元素需要真实的存在
//        System.out.println(value);

//        boolean value = file.mkdirs(); //可以创建文件夹 如果外层没有 也会同时创建
//        System.out.println(value);

//        String pname = getParent(); //获取当前file的父级file名称
//        File file = getParentFile(); //获取当前file的父级file的对象

        File file = new File("D://test//aaa");
        File[] files = file.listFiles();
        System.out.println(files); //数组对象为空，证明当前的file是一个文件，否则是文件夹
        System.out.println(files.length); //数组对象的长度不为0，证明当前的file是一个不为空的文件夹，即文件夹里面有元素

        //通过这个对象 回头在硬盘上 创建文件
        try {
            boolean value = file.createNewFile(); //编译时异常
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String name = file.getName(); //获取文件的名称
        String path = file.getAbsolutePath(); //获取文件的绝对路径
        System.out.println(name);
        System.out.println(path);



        //文件本身的一些属性
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
        System.out.println(file.isFile()); //判断file是否是文件
        System.out.println(file.isDirectory()); //判断file是否是目录

        long l = file.length(); //获取文件中的字节个数
        System.out.println(l);
        long time = file.lastModified(); //获取文件最后修改时间
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));


    }

}
