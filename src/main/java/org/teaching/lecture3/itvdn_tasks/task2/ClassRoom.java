package org.teaching.lecture3.itvdn_tasks.task2;

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


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassRoom {

    private static final Logger logger = LoggerFactory.getLogger(ClassRoom.class);

    private int numberOfPupils;
    private Pupil[] pupils;

    public ClassRoom(int numberOfPupils) {
        if (numberOfPupils > 4) {
            logger.error("The number of the pupils shouldn't be more than 4 persons. You have entered: {}", numberOfPupils);
            throw new IllegalArgumentException("The number of the pupils shouldn't be more than 4 persons. You have entered:");
        }
        pupils = new Pupil[numberOfPupils];
    }

    public void setPupil(Pupil pupil) {
        if ( (numberOfPupils + 1) >= pupils.length) {
            logger.error("Can't add another pupil because arrays of pupils are full.");
            return;
        }
        this.pupils[numberOfPupils] = pupil;
        numberOfPupils++;
    }

    public void setPupil(Pupil pupilA, Pupil pupilB) {
        setPupil(pupilA);
        setPupil(pupilB);
    }

    public void setPupil(Pupil pupilA, Pupil pupilB, Pupil pupilC) {
        setPupil(pupilA, pupilB);
        setPupil(pupilC);
    }

    public Pupil[] getPupils(){
        return pupils;
    }
}
