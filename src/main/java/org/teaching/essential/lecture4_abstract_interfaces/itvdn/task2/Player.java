package org.teaching.essential.lecture4_abstract_interfaces.itvdn.task2;

/*
Создайте 2 интерфейса Playable и Recording. В каждом из интерфейсов создайте по 3 метода void play() /
void pause() / String stop() и String record() / String pause() / String stop() соответственно.
Создайте производный класс Player от базовых интерфейсов Playable и Recording.
Написать программу, которая выполняет проигрывание и запись.
 */

public class Player implements  Recording{

    @Override
    public String play() {
        return "Play.";
    }

    @Override
    public String pause() {
        return "Pause.";
    }

    @Override
    public String stop() {
        return "Stop.";
    }

    @Override
    public String record() {
        return "Record.";
    }
}
