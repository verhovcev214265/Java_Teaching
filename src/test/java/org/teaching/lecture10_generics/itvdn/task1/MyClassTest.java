package org.teaching.lecture10_generics.itvdn.task1;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;

public class MyClassTest {

    @Test
    public void factoryMethod_test(){
        String instanceStr = "Hello";
        Double instanceDouble = 23.17;

        Logger loggerMock = Mockito.mock(Logger.class);
        MyClass.logger = loggerMock;
        MyClass.factoryMethod(instanceStr);
        MyClass.factoryMethod(instanceDouble);

        Mockito.verify(loggerMock).info(instanceStr);
        Mockito.verify(loggerMock).info(String.valueOf(instanceDouble));
    }

    @Test
    @Ignore
    public void factoryMethod_by_Null_test(){
        String instance = null;

        Logger loggerMock = Mockito.mock(Logger.class);
        MyClass.logger = loggerMock;
        MyClass.factoryMethod(instance);

        Mockito.verify(loggerMock).info(instance);
    }
}
