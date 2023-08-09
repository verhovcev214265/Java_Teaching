package org.teaching.lecture8_exceptions.itvdn.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.InputMismatchException;
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
//      Assert.assertEquals("Due you mustn't divided by zero!", calculator.div());

        mockScan.close();
    }

    @Test
    public void operationFactory_test(){
        try {
            when(mockScan.nextInt()).thenReturn(1);
            when(mockScan.nextDouble()).thenReturn(2.4).thenReturn(3.6);
            Assert.assertEquals(6.0, calculator.operationFactory(1), 0.001);

            when(mockScan.nextInt()).thenReturn(2);
            when(mockScan.nextDouble()).thenReturn(12.4).thenReturn(3.4);
            Assert.assertEquals(9.0, calculator.operationFactory(2), 0.001);

            when(mockScan.nextInt()).thenReturn(3);
            when(mockScan.nextDouble()).thenReturn(2.0).thenReturn(5.0);
            Assert.assertEquals(10.0, calculator.operationFactory(3), 0.001);

            when(mockScan.nextInt()).thenReturn(4);
            when(mockScan.nextDouble()).thenReturn(6.0).thenReturn(2.0);
            Assert.assertEquals(3.0, calculator.operationFactory(4), 0.001);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        mockScan.close();
    }

}
