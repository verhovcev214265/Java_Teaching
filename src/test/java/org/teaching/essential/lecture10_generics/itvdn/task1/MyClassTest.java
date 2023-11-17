package org.teaching.essential.lecture10_generics.itvdn.task1;


import org.junit.Test;
import org.junit.Assert;


public class MyClassTest {

    @Test
    public void factoryMethod_forString_test() {
        String string = MyClass.factoryMethod(String.class);
        Assert.assertNotNull(string);
        Assert.assertTrue(string instanceof String);
    }

    @Test
    public void factoryMethod_forClasTest_test(){
        ClassTest classTest = MyClass.factoryMethod(ClassTest.class);
        Assert.assertNotNull(classTest);
        Assert.assertTrue(classTest instanceof ClassTest);
    }

    @Test
    public void factoryMethod_forInteger_test(){
        Integer integer = MyClass.factoryMethod(Integer.class);
        Assert.assertNotNull(integer);
        Assert.assertTrue(integer instanceof Integer);
    }
}
