package org.teaching.essential.lecture10_generics.test.ex_1;

public class Main {
    public static void main(String[] args) {
//        Example<Integer> exInt = new Example<>();
//
//        exInt.addToString(1);
//        exInt.addToString(2);
//        exInt.addToString(3);
//
//        Example<String> exStr = new Example<>();
//        exStr.addToString("one");
//        exStr.addToString("two");
//        exStr.addToString("three");

        Example<Car, String> exCar = new Example<>();
        String str = "The best car!";

        Car carA = new Car("BMW", 2016);
        Car carB = new Car("Audi", 2017);
        Car carC = new Car("Mercedes", 2018);

        exCar.addToString(carA, str);
        exCar.addToString(carB, str);
        exCar.addToString(carC, str);

        System.out.println(exCar.getString());

//        System.out.println(
//                "Integer: " + exInt.getString() + "." +
//                        "\n" + "String: " + exStr.getString() + ".\n" +
//                        "Cars \n" + exCar.getString()
//        );

    }
}
