package org.teaching.lecture5.itvdn.task0;

public class MiddleTeacher extends Teacher{

    public MiddleTeacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String aboutTeacher() {
        return "Middle teacher";
    }
}
