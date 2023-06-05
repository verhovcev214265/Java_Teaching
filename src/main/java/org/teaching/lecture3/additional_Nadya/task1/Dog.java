package org.teaching.lecture3.additional_Nadya.task1;

public class Dog extends Pet{

    public Dog(String name, String type){
        super(name, type);
    }

    @Override
    public String sound(){
        return "Gav - gav";
    }

    @Override
    public String show(){
        return super.show();
    }

    @Override
    public String type(){
        return super.type();
    }
}
