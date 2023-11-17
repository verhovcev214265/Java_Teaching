package org.teaching.essential.lecture2_classes_p2.task2;

/*
Реализуйте класс Дробь. Необходимо хранить числитель и знаменатель в качестве полей.
Реализуйте методы для ввода данных в поля, а также конструктор с параметрами. Выполните арифметические операции
(сложение, вычитание, умножение, деление, и т.д.) дроби с дробью.
 */

public class Fraction {

    private double numerator;
    private double denominator;

    public Fraction() {
    }

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction add(Fraction fractionA, Fraction fractionB) {

        return new Fraction(
                fractionA.getNumerator() + fractionB.getNumerator(),
                fractionA.getDenominator() + fractionB.getDenominator()
        );
    }

//    public void addNonStatic(Fraction fractionA, Fraction fractionB){
//        this.numerator = fractionA.getNumerator() + fractionB.getNumerator();
//        this.denominator = fractionB.getDenominator() + fractionB.getDenominator();
//    }
//
//    public Fraction addNonStatic2(Fraction fractionA, Fraction fractionB){
//        this.numerator = fractionA.getNumerator() + fractionB.getNumerator();
//        this.denominator = fractionA.getDenominator() + fractionB.getDenominator();
//
//        return this;
//    }

    public static Fraction sub(Fraction fractionA, Fraction fractionB) {
        return new Fraction(
                fractionA.getNumerator() - fractionB.getNumerator(),
                fractionA.getDenominator() - fractionB.getDenominator()
        );
    }

    public static Fraction mul(Fraction fractionA, Fraction fractionB) {
        return new Fraction(
                fractionA.getNumerator() * fractionB.getNumerator(),
                fractionA.getDenominator() * fractionB.getDenominator()
        );
    }

    public Fraction div(Fraction fractionA, Fraction fractionB) {
        if (fractionB.getNumerator() == 0 || fractionB.getDenominator() == 0) {
            this.numerator = 0;
            this.denominator = 0;
        } else {
            this.numerator = fractionA.getNumerator() / fractionB.getNumerator();
            this.denominator = fractionA.getDenominator() / fractionB.getDenominator();
        }
        return this;
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
