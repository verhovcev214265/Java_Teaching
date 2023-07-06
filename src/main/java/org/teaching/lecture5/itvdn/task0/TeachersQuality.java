package org.teaching.lecture5.itvdn.task0;

import java.util.ArrayList;
import java.util.List;

public class TeachersQuality {

    private List<Teacher> teachers;

    public int getBestTeacher() {

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i) instanceof BestTeacher) {
                return i;
            }
        }
        return -1;
    }

    public int getMiddleTeacher() {

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i) instanceof MiddleTeacher) {
                return i;
            }
        }
        return -1;
    }

    public int getWorstTeacher() {

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i) instanceof WorstTeacher) {
                return i;
            }
        }
        return -1;
    }

    public void addTeacher(Teacher teacher) {

        if (teachers == null){
            teachers = new ArrayList<>();
        }

        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
