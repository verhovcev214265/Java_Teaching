package org.teaching.essential.lecture3_inheritance.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teaching.java.essential.lecture3_inheritance.itvdn_tasks.task2.*;

import static org.junit.Assert.assertThrows;

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
        classRoom.setPupil(new ExcellentPupil());
        classRoom.setPupil(new ExcellentPupil(), new GoodPupil(), new BadPupil());
    }

    @Test()
    public void testClassRoom_ByIllegalArgument() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            classRoom = new ClassRoom(5);
        });

        String expectedMessage = "The number of the pupils shouldn't be more than 4 persons. You have entered: " + 5;
        String actualMessage = exception.getMessage();

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void checkSet(){
        try {
            classRoom.setPupil(new BadPupil());
        }catch (Exception e){
            Assert.fail();
        }
    }

    @Test
    public void checkPupilsLength() {
        Assert.assertEquals(4, classRoom.getPupils().length);
    }

    @Test
    public void checkExcellentPupilStudying() {
        Pupil pupilExcellent = classRoom.getPupils()[0];

        Assert.assertEquals("Excellent study", pupilExcellent.study());
        Assert.assertEquals("Excellent read", pupilExcellent.read());
        Assert.assertEquals("Excellent write", pupilExcellent.write());
        Assert.assertEquals("Excellent relax", pupilExcellent.relax());
    }

    @Test
    public void checkThirdPupilStudying() {
        Pupil goodPupil = classRoom.getPupils()[2];

        Assert.assertEquals("Good study", goodPupil.study());
        Assert.assertEquals("Good read", goodPupil.read());
        Assert.assertEquals("Good write", goodPupil.write());
        Assert.assertEquals("Good relax", goodPupil.relax());
    }

    @Test
    public void checkFourthPupilStudying() {
        Pupil badPupil = classRoom.getPupils()[3];

        Assert.assertEquals("Bad study", badPupil.study());
        Assert.assertEquals("Bad read", badPupil.read());
        Assert.assertEquals("Bad write", badPupil.write());
        Assert.assertEquals("Bad relax", badPupil.relax());
    }
}
