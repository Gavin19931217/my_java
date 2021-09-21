package test.com.wind.java;

import com.wind.java.ExchangeArray;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2021/9/21/021 18:23
 */
public class ExchangeArrayTest {
    ExchangeArray exchangeArray = new ExchangeArray();

    @Test
    public void printExchangeArr() {
        int[] x = new int[]{1, 2, 3, 4};
        int[] y = new int[]{5, 6, 7, 8};
        exchangeArray.exchangeArr(x, y);
    }

}