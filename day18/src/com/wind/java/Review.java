package com.wind.java;

public class Review {
    //知识回顾 Throwable
    //Error  Exception
    //错误    异常
//    通常是一些物理性错误   认为规定的一些不正常现象
//    StackOverflowError 运行时RuntimeException
//    OutOfMemoryError 编译时

//    处理异常的手段
//    try{} catch(){} finally{}
//    1.try不能单独出现，后面必须跟着其他的一个结构 catch或finally都可以
//    2.catch可以出现多个 要么多个catch捕获的异常没有继承关系 先捕获小 再捕获大
//    3.finally可有可无的，若添加了这个结构，则必须执行，即便是放在方法中，之前有return也会执行
//    4.注意方法内部返回值问题
//    5.finally可能出现的笔试题 final finally finalize区别

//    throws
//    1.只能在方法和构造方法结构上存在（抛出异常）
//    2.谁调用此方法 谁处理异常
//    3.抛出的异常也可以有多个 用逗号隔开

//    自定义
//    1.写一个类 继承Exception RuntimeException
//    2.类中可以写带String参数的构造方法 可以细致的说明
//    3.通过throw关键字 new一个异常的对象

}
