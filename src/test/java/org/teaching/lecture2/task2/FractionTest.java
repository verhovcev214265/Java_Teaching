package org.teaching.lecture2.task2;

/*
Реализуйте класс Дробь. Необходимо хранить числитель и знаменатель в качестве полей.
Реализуйте методы для ввода данных в поля, а также конструктор с параметрами. Выполните арифметические операции
(сложение, вычитание, умножение, деление, и т.д.) дроби с дробью.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fractionA;
    private Fraction fractionB;
    double numerator = 10.5;
    double denominator = 2.5;

    @Before
    public void setUp(){
        fractionA = new Fraction(numerator, denominator);
        fractionB = new Fraction();
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(fractionA);
        Assert.assertNotNull(fractionB);
    }

    @Test
    public void check_Constructor(){
        Assert.assertEquals(numerator, fractionA.getNumerator(), 0.0001);
        Assert.assertEquals(denominator, fractionA.getDenominator(), 0.0001);
    }

    @Test
    public void check_SeparateFields_Accessories(){
        fractionB.setNumerator(numerator);
        fractionB.setDenominator(denominator);

        Assert.assertEquals(numerator, fractionB.getNumerator(), 0.0001);
        Assert.assertEquals(denominator, fractionB.getDenominator(), 0.0001);
    }

    @Test
    public void add_test(){
        Assert.assertEquals(13.0, fractionA.add(fractionA), 0.0001);
    }

    @Test
    public void sub_test(){
        Assert.assertEquals(8.0, fractionA.sub(fractionA), 0.0001);
    }

    @Test
    public void mul_test(){
        Assert.assertEquals(26.25, fractionA.mul(fractionA), 0.0001);
    }

    @Test
    public void div_test(){
        Assert.assertEquals(4.2, fractionA.div(fractionA), 0.0001);
    }
}
