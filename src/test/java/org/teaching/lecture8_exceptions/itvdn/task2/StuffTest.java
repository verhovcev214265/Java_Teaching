package org.teaching.lecture8_exceptions.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.junit.Rule;
//import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class StuffTest {

    private Staff staff;
    private List<String> expected;
    Worker worker;

    @Before
    public void setUp(){
        staff = new Staff(5);

        Scanner mockScan = Mockito.mock(Scanner.class);
        staff.setScan(mockScan);

        expected = new ArrayList<>();

        when(mockScan.next()).thenReturn("Oleks").thenReturn("Horianinskyi").thenReturn("developer").thenReturn("2018");
        staff.setWorker(new Worker("Oleks", "Horianinskyi", "developer", 2018));

        when(mockScan.next()).thenReturn("Olek").thenReturn("Aorianinsky").thenReturn("develope").thenReturn("2019");
        staff.setWorker(new Worker("Olek", "Aorianinsky", "develope", 2019));

        when(mockScan.next()).thenReturn("Ole").thenReturn("Corianinsk").thenReturn("develop").thenReturn("2020");
        staff.setWorker(new Worker("Ole", "Corianinsk", "develop", 2020));

        when(mockScan.next()).thenReturn("Ol").thenReturn("Dorianins").thenReturn("develo").thenReturn("2021");
        staff.setWorker(new Worker("Ol", "Dorianins", "develo", 2021));

        when(mockScan.next()).thenReturn("O").thenReturn("Borianin").thenReturn("devel").thenReturn("2022");
        staff.setWorker(new Worker("O", "Borianin", "devel", 2022));
    }

    @Test
    public void testStuff_By_IllegalArgument(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> staff = new Staff(6));

        String expectedMessage = "The number of the workers shouldn't be more than 5 - persons. You've entered: 6";
        String actual = exception.getMessage();

        Assert.assertEquals(expectedMessage, actual);
    }

//    @Rule
//    public ExpectedException exceptionRule = ExpectedException.none();
//
//    @Test()
//    public void testStuff_By_NumberFormatException(){
//        exceptionRule.expect(NumberFormatException.class);
//
//        worker = new Worker("Vasiliy", "Baranskyi", "security", "qwed");
//        worker = new Worker("Vasiliy", "Baranskyi", "security", "112.0");
//        worker = new Worker("Vasiliy", "Baranskyi", "security", "&$#!@");
//    }

    @Test
    public void setWorker_test(){

        expected = Arrays.asList(
                "Worker - name: Oleks, surname: Horianinskyi, position: developer, year of entry into work: 2018.",
                "Worker - name: Olek, surname: Aorianinsky, position: develope, year of entry into work: 2019.",
                "Worker - name: Ole, surname: Corianinsk, position: develop, year of entry into work: 2020.",
                "Worker - name: Ol, surname: Dorianins, position: develo, year of entry into work: 2021.",
                "Worker - name: O, surname: Borianin, position: devel, year of entry into work: 2022."
        );

        for (int i = 0; i < staff.getWorkers().length; i++) {
            Assert.assertEquals(expected.get(i), staff.getWorkers()[i].toString());
        }
    }

    @Test
    public void sortCheck(){


        expected = Arrays.asList(
                "Worker - name: Olek, surname: Aorianinsky, position: develope, year of entry into work: 2019.",
                "Worker - name: O, surname: Borianin, position: devel, year of entry into work: 2022.",
                "Worker - name: Ole, surname: Corianinsk, position: develop, year of entry into work: 2020.",
                "Worker - name: Ol, surname: Dorianins, position: develo, year of entry into work: 2021.",
                "Worker - name: Oleks, surname: Horianinskyi, position: developer, year of entry into work: 2018."
        );

        Arrays.sort(staff.getWorkers());

        for (int i = 0; i < staff.getWorkers().length; i++) {
            Assert.assertEquals(expected.get(i), staff.getWorkers()[i].toString());
        }
    }

    @Test
    public void calculateExperience_test_withoutSort(){
        List<String> expected = Arrays.asList("Horianinskyi", "Aorianinsky");

        Assert.assertEquals(expected, staff.calculateExperience(3));
    }

    @Test
    public void calculateExperience_test_WithSort(){
        Arrays.sort(staff.getWorkers());

        List<String> expected = Arrays.asList("Aorianinsky", "Horianinskyi");

        Assert.assertEquals(expected, staff.calculateExperience(3));
    }

}
