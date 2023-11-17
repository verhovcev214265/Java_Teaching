package org.teaching.essential.lecture3_inheritance.additional_Nadya.task1;

public class Dog extends Pet{

    public Dog(String name, String type){
        super(name, type);
    }

    @Override
    public String sound(){
        return "Gav - gav";
    }

}
