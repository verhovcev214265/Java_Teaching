package org.teaching.lecture6_inners_nestedes.itvdn.task1;

/*
Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые
также должны содержать метод print.
 */

public class Vehicle {

    public String print(){
        return "Vehicle has printed";
    }

    class Wheel{
        public String print(){
            return "Wheel has printed";
        }
    }

    class Door{
        public String print(){
            return "Door has printed";
        }

    }
}
