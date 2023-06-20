package org.teaching.Lecture5.itvdn.task0;

import java.util.ArrayList;

public class TeachersQuality {

    public ArrayList<Teacher> addTeachers(){

        ArrayList<Teacher> myTeachers = new ArrayList<>();

        myTeachers.add(new TeacherOfMathematics("Ludmyla", "Germanovna"));
        myTeachers.add(new TeacherOfEnglish("Zoya", "Victoriva"));
        myTeachers.add(new TeacherOfSport("Goryn", "Gorynych"));

        return myTeachers;
    }

}
