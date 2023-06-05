package org.teaching.lecture3.additional_Nadya.task1;

public class Cat extends Pet{

    public Cat(String name, String type){
        super(name, type);
    }

    @Override
    public String sound(){
        return "Meow - meow";
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
