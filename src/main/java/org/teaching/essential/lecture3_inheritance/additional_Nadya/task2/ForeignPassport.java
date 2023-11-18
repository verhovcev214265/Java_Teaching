package org.teaching.essential.lecture3_inheritance.additional_Nadya.task2;

public class ForeignPassport extends Passport{

    private final boolean schengenVisa;
    private final int number;

    public ForeignPassport(String name, String sureName, int day, int month, int year, boolean schengenVisa, int number){
        super(name, sureName, day, month, year);
        this.schengenVisa = schengenVisa;
        this.number = number;
    }

    public boolean isSchengenVisa() {
        return schengenVisa;
    }

    public int getNumber() {
        return number;
    }
}
