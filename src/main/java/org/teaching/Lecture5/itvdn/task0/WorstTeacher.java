package org.teaching.Lecture5.itvdn.task0;

public class WorstTeacher extends Teacher{

    public WorstTeacher(String name, String surName){
        super(name, surName);
    }

    @Override
    public String aboutTeacher(){
        return "The worst teacher.";
    }
}
