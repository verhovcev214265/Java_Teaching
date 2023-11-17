package org.teaching.depth.lecture1_iterator_comparator.task1;

/*
Задание
В папке с примерами, ex_004_comparable.
Дописать логику, чтобы метод compareTo() осуществил поиск по скорости(если же скорость у 2-х объектов
равна, то ищем по цене) -> цене - > моделе(breed) -> цвету машины(weight)  =)
 */

public class Animal implements Comparable<Animal>{
    private final String breed;
    private final int weight;
    private final int speed;
    private final int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Animal: breed - " + this.breed + ", weight = " + this.weight +
                ", speed = " + this.speed + ", price = " + this.price + ".";
    }

    public int compareTo(Animal other) {
        int tmp = this.speed - other.speed;

        if (tmp == 0) {
            tmp = this.price - other.price;
            if (tmp == 0){
                tmp = this.breed.compareTo(other.breed);
                if (tmp == 0){
                    tmp = this.weight - other.weight;
                }
            }
        }
        return tmp;
    }

}
