package org.teaching.lecture10_generics.itvdn.task1;

import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.junit.Assert;

public class MyClassTest {

    @Test
    public void factoryMethod_test(){
        String instanceStr = "Hello";
        Double instanceDouble = 23.17;

        Logger loggerMock = Mockito.mock(Logger.class);
        MyClass.logger = loggerMock;
        String str = MyClass.factoryMethod(String.class);
        Logger logger = MyClass.factoryMethod(Logger.class);

        Mockito.verify(loggerMock).info(instanceStr);
        Mockito.verify(loggerMock).info(String.valueOf(instanceDouble));
    }

    @Test
    public void factoryMethod_forString_test(){
        String str = MyClass.factoryMethod(String.class);
        Assert.assertNotNull(str);
        Assert.assertTrue(str instanceof String);
    }

}
