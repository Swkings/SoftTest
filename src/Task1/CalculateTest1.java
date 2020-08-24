package Task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Swking
 * @email : 1114006175@qq.com
 * @Date : 2020/08/13
 * @File : CalculateTest1
 * @Desc :
 **/
public class CalculateTest1 {
    Calculate calculate;
    @Before
    public void setUp() throws Exception {
        calculate = new Calculate();
    }
    @Test
    public void test3() {
        assertEquals(5, calculate.sum(2,3));
    }
    @Test
    public void test4() {
        assertEquals(6, calculate.sum(1,2));
    }
}