package org.teaching.essential.lecture3_inheritance.additional_Nadya.task2;

/*
Создайте класс Passport (паспорт), который будет содержать паспортную информацию о гражданине Украины.
С помощью механизма наследования, реализуйте класс ForeignPassport (загран.паспорт) производный от Passport.
Напомним, что заграничный паспорт содержит помимо паспортных данных, также данные о визах, номер заграничного паспорта.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PassportTest {

    private Passport passport;

    @Before
    public void setUp(){
        passport = new Passport("Oleksandr", "Verhovcev", 2, 8, 1992);
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals("Oleksandr", passport.getName());
        Assert.assertEquals("Verhovcev", passport.getSureName());
        Assert.assertEquals(2, passport.getDay());
        Assert.assertEquals(8, passport.getMonth());
        Assert.assertEquals(1992, passport.getYear());
    }
}
