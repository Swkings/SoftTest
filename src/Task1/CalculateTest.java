package Task1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @Author: Swking
 * @email : 1114006175@qq.com
 * @Date : 2020/08/13
 * @File : CalculateTest
 * @Desc :
 **/
public class CalculateTest {
    Calculate calculate;
    @Before
    public void setUp() throws Exception {
        calculate = new Calculate();
    }
    @Test
    public void test1() {
        assertEquals(10, calculate.sum(2,8));
    }
    @Test
    public void test2() {
        assertEquals(10, calculate.sum(6,8));
    }
}