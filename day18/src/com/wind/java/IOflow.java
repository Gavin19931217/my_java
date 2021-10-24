package com.wind.java;

import java.io.File;
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
        File file = new File("D://Code//Intellij IDEA//test//abc.txt");  //file对象是堆内存中创建出来的一个对象空间

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
