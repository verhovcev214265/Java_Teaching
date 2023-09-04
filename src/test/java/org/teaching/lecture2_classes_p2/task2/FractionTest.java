package org.teaching.lecture2_classes_p2.task2;

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
        fractionB.setNumerator(numerator);
        fractionB.setDenominator(denominator);
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
        Assert.assertEquals(numerator, fractionB.getNumerator(), 0.0001);
        Assert.assertEquals(denominator, fractionB.getDenominator(), 0.0001);
    }

    @Test
    public void add_test(){
        Fraction result = Fraction.add(fractionA, fractionB);

        Assert.assertEquals(21.0, result.getNumerator(), 0.001);
        Assert.assertEquals(5.0, result.getDenominator(), 0.001);
    }

//    @Test
//    public void add2_test(){
//        Fraction result = new Fraction();
//        result.addNonStatic(fractionA, fractionB);
//
//        Assert.assertEquals(21.0, result.getNumerator(), 0.001);
//        Assert.assertEquals(5.0, result.getDenominator(), 0.001);
//    }
//
//    @Test
//    public void add3_test(){
//        Fraction result = new Fraction().addNonStatic2(fractionA, fractionB);
//
//        Assert.assertEquals(21.0, result.getNumerator(), 0.001);
//        Assert.assertEquals(5.0, result.getDenominator(), 0.001);
//    }

    @Test
    public void sub_test(){
        Fraction result = Fraction.sub(fractionA, fractionB);

        Assert.assertEquals(0.0, result.getNumerator(), 0.001);
        Assert.assertEquals(0.0, result.getDenominator(), 0.001);
    }

    @Test
    public void mul_test(){
        Fraction result = Fraction.mul(fractionA, fractionB);

        Assert.assertEquals(110.25, result.getNumerator(),0.001);
        Assert.assertEquals(6.25, result.getDenominator(),0.001);
    }

    @Test
    public void div_test(){
        Fraction result = new Fraction().div(fractionA, fractionB);

        Assert.assertEquals(1.0, result.getNumerator(), 0.001);
        Assert.assertEquals(1.0, result.getDenominator(), 0.001);
    }
}
