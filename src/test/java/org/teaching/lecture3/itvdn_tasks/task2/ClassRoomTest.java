package org.teaching.lecture3.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Создать класс, представляющий учебный класс ClassRoom.
Создайте класс ученик Pupil. В теле класса создайте методы <--String--> void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcellentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
переопределите каждый из методов, в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
отдыхать
 */

public class ClassRoomTest {

    private ClassRoom classRoom;

    @Before
    public void setUp() {
        classRoom = new ClassRoom(4);
    }

    @Test
    public void checkPupilsLength(){
        Assert.assertEquals(4, classRoom.getPupils().length);
    }

    @Test
    public void checkExcellentPupilStudying() {
        Pupil excellent = new ExcellentPupil();

        Assert.assertEquals("Excellent study", excellent.study());
        Assert.assertEquals("Excellent read", excellent.read());
        Assert.assertEquals("Excellent write", excellent.write());
        Assert.assertEquals("Excellent relax", excellent.relax());
    }

    @Test
    public void checkThirdPupilStudying() {
        Pupil good = new GoodPupil();

        Assert.assertEquals("Good study", good.study());
        Assert.assertEquals("Good read", good.read());
        Assert.assertEquals("Good write", good.write());
        Assert.assertEquals("Good relax", good.relax());
    }

    @Test
    public void checkFourthPupilStudying() {
        Pupil bad = new BadPupil();

        Assert.assertEquals("Bad study", bad.study());
        Assert.assertEquals("Bad read", bad.read());
        Assert.assertEquals("Bad write", bad.write());
        Assert.assertEquals("Bad relax", bad.relax());
    }
}
