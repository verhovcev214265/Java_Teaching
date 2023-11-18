package org.teaching.essential.lecture10_generics.itvdn.task1;

/*
Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который
будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения
типом – Т). 
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass<T> {
    protected static Logger logger = LoggerFactory.getLogger(MyClass.class);

    public static <T> T factoryMethod(Class<T> klass){
        if (klass == Integer.class){
            return (T) Integer.valueOf(0);
        }
        try {
            return klass.newInstance();
        }catch (InstantiationException | IllegalAccessException e){
            logger.error("Can't instantiate new object");
            return null;
        }
    }
}
