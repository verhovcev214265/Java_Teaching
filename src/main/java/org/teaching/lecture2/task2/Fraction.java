package org.teaching.lecture2.task2;

/*
Реализуйте класс Дробь. Необходимо хранить числитель и знаменатель в качестве полей.
Реализуйте методы для ввода данных в поля, а также конструктор с параметрами. Выполните арифметические операции
(сложение, вычитание, умножение, деление, и т.д.) дроби с дробью.
 */

public class Fraction {

    private double numerator;
    private double denominator;

    public Fraction(){}

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double add(Fraction fraction){
        return fraction.getNumerator() + fraction.getDenominator();
    }

    public double sub(Fraction fraction){
        return fraction.getNumerator() - fraction.getDenominator();
    }

    public double mul(Fraction fraction){
        return fraction.getNumerator() * fraction.getDenominator();
    }

    public double div(Fraction fraction){
        if (fraction.getDenominator() == 0){
            return -999.999;
        }else {
            return (fraction.getNumerator() / fraction.getDenominator());
        }
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }
}
