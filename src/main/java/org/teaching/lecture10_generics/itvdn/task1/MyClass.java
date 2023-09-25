package org.teaching.lecture10_generics.itvdn.task1;

/*
Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который
будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения
типом – Т). 
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass<T> {
    private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

    public static <T> void factoryMethod(T instance){
        logger.info(instance.toString());
    }
}
