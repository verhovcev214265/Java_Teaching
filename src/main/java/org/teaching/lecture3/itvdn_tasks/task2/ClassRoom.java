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

public class ClassRoom {

    private final Pupil first;
    private final Pupil second;
    private final Pupil third;
    private final Pupil fourth;

    public ClassRoom(Pupil first, Pupil second, Pupil third, Pupil fourth){
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public Pupil getFirst() {
        return first;
    }

    public Pupil getSecond() {
        return second;
    }

    public Pupil getThird() {
        return third;
    }

    public Pupil getFourth() {
        return fourth;
    }
}
