package test.com.wind.java;

import com.wind.java.HelloWorld;
import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2021/9/21/021 18:17
 */
public class HelloWorldTest {
    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void printHelloWorld() {
        helloWorld.printHello();
    }

}