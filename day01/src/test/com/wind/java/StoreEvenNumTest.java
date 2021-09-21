package test.com.wind.java;

import com.wind.java.StoreEvenNum;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2021/9/21/021 18:27
 */
public class StoreEvenNumTest {
    StoreEvenNum storeEvenNum = new StoreEvenNum();

    @Test
    public void printEvenNum() {
        storeEvenNum.printEvenNumber();
    }

}