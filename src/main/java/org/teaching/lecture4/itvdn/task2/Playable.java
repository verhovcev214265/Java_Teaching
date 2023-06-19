package org.teaching.lecture4.itvdn.task2;

/*
Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() /
void pause() / String stop() и String record() / String pause() / String stop() соответственно.
Создайте производный класс Player от базовых интерфейсов Playable и Recording.
Написать программу, которая выполняет проигрывание и запись.
 */

public interface Playable {

    String play();

    String pause();

    String stop();
}
