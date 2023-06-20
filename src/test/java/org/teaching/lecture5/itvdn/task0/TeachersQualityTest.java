package org.teaching.lecture5.itvdn.task0;

/*
Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teaching.Lecture5.itvdn.task0.Teacher;
import org.teaching.Lecture5.itvdn.task0.TeachersQuality;

public class TeachersQualityTest {

    private TeachersQuality teachers;

    @Before
    public void setUp(){
        teachers = new TeachersQuality();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(teachers);

        for (int i = 0; i < teachers.addTeachers().size(); i++) {
            Assert.assertTrue(teachers.addTeachers().get(i) instanceof Teacher);
        }
    }

    @Test
    public void shouldReturn_TheBestTeacher(){
        Assert.assertEquals("The best teacher.", teachers.addTeachers().get(0).aboutTeacher());
    }

    @Test
    public void shouldReturn_TheNormalTeacher(){
        Assert.assertEquals("Normal teacher.", teachers.addTeachers().get(1).aboutTeacher());
    }

    @Test
    public void shouldReturn_TheWorstTeacher(){
        Assert.assertEquals("The worst teacher.", teachers.addTeachers().get(2).aboutTeacher());
    }


}
