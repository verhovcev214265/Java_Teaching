package org.teaching.lecture3.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void setUp(){
        classRoom = new ClassRoom(new ExcellentPupil(), new ExcellentPupil(), new GoodPupil(), new BadPupil());
    }

    @Test
    public void checkFirstPupilStudying(){
        Assert.assertEquals( "Excellent study", classRoom.getFirst().study());
        Assert.assertEquals( "Excellent read", classRoom.getFirst().read());
        Assert.assertEquals( "Excellent write", classRoom.getFirst().write());
        Assert.assertEquals( "Excellent relax", classRoom.getFirst().relax());
    }

    @Test
    public void checkSecondPupilStudying(){
        Assert.assertEquals( "Excellent study", classRoom.getSecond().study());
        Assert.assertEquals( "Excellent read", classRoom.getSecond().read());
        Assert.assertEquals( "Excellent write", classRoom.getSecond().write());
        Assert.assertEquals( "Excellent relax", classRoom.getSecond().relax());
    }

    @Test
    public void checkThirdPupilStudying(){
        Assert.assertEquals( "Good study", classRoom.getThird().study());
        Assert.assertEquals( "Good read", classRoom.getThird().read());
        Assert.assertEquals( "Good write", classRoom.getThird().write());
        Assert.assertEquals( "Good relax", classRoom.getThird().relax());
    }

    @Test
    public void checkFourthPupilStudying(){
        Assert.assertEquals( "Bad study", classRoom.getFourth().study());
        Assert.assertEquals( "Bad read", classRoom.getFourth().read());
        Assert.assertEquals( "Bad write", classRoom.getFourth().write());
        Assert.assertEquals( "Bad relax", classRoom.getFourth().relax());
    }
}
