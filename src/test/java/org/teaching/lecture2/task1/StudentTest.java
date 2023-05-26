package org.teaching.lecture2.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
Реализуйте класс “Студент”. Необходимо хранить в полях класса: ФИО, дату рождения, контактный телефон, номер группы.
Реализуйте методы класса для ввода данных, вывода данных, реализуйте аксессоры для доступа к отдельным полям,
а также конструктор с параметрами после создайте несколько обьектов и пощитайте их количество.
 */

public class StudentTest {

    private Student studentA;
    private Student studentB;

    private final String name = "Oleksandr";
    private final String sureName = "Verhovcev";
    private final int dataOfBirth = 1991;
    private final long phoneNumber = 380_96_775_12_40L;
    private final int numberOfGroup = 14;

    @Before
    public void setUp(){
        studentA = new Student();
        studentB = new Student(name, sureName, dataOfBirth, phoneNumber, numberOfGroup);
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(studentA);
        Assert.assertNotNull(studentB);
    }

    @Test
    public void check_SeparateFields_Accessories(){

        studentA.setName(name);
        studentA.setSureName(sureName);
        studentA.setDataOfBirth(dataOfBirth);
        studentA.setPhoneNumber(phoneNumber);
        studentA.setNumberOfGroup(numberOfGroup);

        Assert.assertEquals(name, studentA.getName());
        Assert.assertEquals(sureName, studentA.getSureName());
        Assert.assertEquals(dataOfBirth, studentA.getDataOfBirth());
        Assert.assertEquals(phoneNumber, studentA.getPhoneNumber());
        Assert.assertEquals(numberOfGroup, studentA.getNumberOfGroup());
    }

    @Test
    public void check_Constructor(){

        Assert.assertEquals(name, studentB.getName());
        Assert.assertEquals(sureName, studentB.getSureName());
        Assert.assertEquals(dataOfBirth, studentB.getDataOfBirth());
        Assert.assertEquals(phoneNumber, studentB.getPhoneNumber());
        Assert.assertEquals(numberOfGroup, studentB.getNumberOfGroup());
    }

    @Test
    public void checkCount(){
        Student studentB = new Student();
        Student studentC = new Student();
        Student studentD = new Student();

        Assert.assertEquals(Student.count, studentA.getCount());
        Assert.assertEquals(Student.count, studentB.getCount());
        Assert.assertEquals(Student.count, studentC.getCount());
        Assert.assertEquals(Student.count, studentD.getCount());
    }
}
