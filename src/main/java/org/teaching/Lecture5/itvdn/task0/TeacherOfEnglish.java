package org.teaching.Lecture5.itvdn.task0;

public class TeacherOfEnglish extends Teacher{

    public TeacherOfEnglish(String name, String surName){
        super(name, surName);
    }

    @Override
    public String aboutTeacher(){
        return "Normal teacher.";
    }
}
