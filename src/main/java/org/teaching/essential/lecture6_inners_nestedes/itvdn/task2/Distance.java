package org.teaching.essential.lecture6_inners_nestedes.itvdn.task2;

/*
Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
измерения (к примеру, из метров в километры, из километров в мили, и так далее).
 */

public class Distance {

    static class Converter {

        public double toKilometers(double meters) {
            return meters / 1000;
        }

        public double toMiles(double kilometers) {
            return kilometers * 0.621;
        }
    }
}
