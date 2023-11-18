package org.teaching.essential.lecture3_inheritance.additional_Nadya.task1;

public class Cat extends Pet{

    public Cat(String name, String type){
        super(name, type);
    }

    @Override
    public String sound(){
        return "Meow - meow";
    }
}
