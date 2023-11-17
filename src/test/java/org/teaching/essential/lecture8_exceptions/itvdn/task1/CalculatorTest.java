package org.teaching.essential.lecture8_exceptions.itvdn.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.mockito.Mockito.*;

public class CalculatorTest {

    private Calculator calculator;
    private Scanner mockScan;

    @Before
    public void setUp(){
        mockScan = Mockito.mock(Scanner.class);
        calculator = new Calculator();
        calculator.setScan(mockScan);
    }

    @Test
    public void add_test(){
        when(mockScan.nextDouble()).thenReturn(12.5).thenReturn(2.5);
        Assert.assertEquals(15.0, calculator.add(), 0.001);
        mockScan.close();
    }

    @Test
    public void sub_test(){
        when(mockScan.nextDouble()).thenReturn(32.4).thenReturn(2.1);
        Assert.assertEquals(30.3, calculator.sub(), 0.001);
        mockScan.close();
    }

    @Test
    public void mul_test(){
        when(mockScan.nextDouble()).thenReturn(20.0).thenReturn(5.0);
        Assert.assertEquals(100.0, calculator.mul(), 0.001);
        mockScan.close();
    }

    @Test
    public void div_test(){
        when(mockScan.nextDouble()).thenReturn(12.6).thenReturn(2.0);
        Assert.assertEquals(6.3, calculator.div(), 0.001);
        mockScan.close();
    }

    @Test(expected = ArithmeticException.class)
    public void check_divByZero(){
        when(mockScan.nextDouble()).thenReturn(10.0).thenReturn(0.0);
        calculator.div();
        mockScan.close();
    }
}
