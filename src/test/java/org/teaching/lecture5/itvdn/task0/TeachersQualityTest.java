package org.teaching.lecture5.itvdn.task0;

/*
Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teaching.Lecture5.itvdn.task0.*;

import java.util.List;

public class TeachersQualityTest {

    private TeachersQuality teachers;

    @Before
    public void setUp(){
        teachers = new TeachersQuality();
        teachers.addTeacher(new WorstTeacher("A", "B"));
        teachers.addTeacher(new BestTeacher("C", "D"));
        teachers.addTeacher(new MiddleTeacher("E", "F"));
    }

    @Test
    public void checkInheritance(){
        List<Teacher> teacherList = teachers.getTeachers();
        for (int i = 0; i < teacherList.size(); i++) {
            Assert.assertTrue(teacherList.get(i) instanceof Teacher);
        }
    }

    @Test
    public void shouldReturn_TheBestTeacher(){
        Assert.assertEquals(1, teachers.getBestTeacher());
    }

    @Test
    public void shouldReturn_TheNormalTeacher(){

    }

    @Test
    public void shouldReturn_TheWorstTeacher(){

    }


}
