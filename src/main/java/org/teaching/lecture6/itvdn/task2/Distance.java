package org.teaching.lecture6.itvdn.task2;

/*
Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
измерения (к примеру, из метров в километры, из километров в мили, и так далее).
 */

public class Distance {

    private static double distance;

    static class Converter {

        public double toKilometers(double meters) {
            distance = meters / 1000;
            return distance;
        }

        public double toMiles(double kilometers) {
            distance = kilometers * 0.621;
            return distance;
        }
    }

    public static double getDistance() {
        return distance;
    }
}
