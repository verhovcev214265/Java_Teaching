package org.teaching.Lecture5.itvdn.task0;

public class TeacherOfMathematics extends Teacher {

    public TeacherOfMathematics(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String aboutTeacher() {
        return "The best teacher.";
    }
}
