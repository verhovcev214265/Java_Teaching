package org.teaching.lecture3.additional_Nadya.task1;

public class Dog extends Pet{

    public Dog(String name, String type){
        super(name, type);
    }

    @Override
    public String sound(){
        return "Gav - gav";
    }

}
