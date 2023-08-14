package org.teaching.lecture8_exceptions.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.mockito.Mockito.when;

public class WorkerTest {

    private Staff staff;
    private Scanner mockScan;
    private List<String> expected;

    @Before
    public void setUp(){
        staff = new Staff(5);

        mockScan = Mockito.mock(Scanner.class);
        staff.setScan(mockScan);

        expected = new ArrayList<>();
    }

    @Test
    public void setWorker_test(){

        when(mockScan.next()).thenReturn("Oleks").thenReturn("Horianinskyi").thenReturn("developer");
        when(mockScan.nextInt()).thenReturn(2018);
        staff.setWorker(new Worker("Oleks", "Horianinskyi", "developer", 2018));

        when(mockScan.next()).thenReturn("Olek").thenReturn("Horianinskyi").thenReturn("developer");
        when(mockScan.nextInt()).thenReturn(2018);
        staff.setWorker(new Worker("Olek", "Horianinskyi", "developer", 2018));

        when(mockScan.next()).thenReturn("Ole").thenReturn("Horianinskyi").thenReturn("developer");
        when(mockScan.nextInt()).thenReturn(2018);
        staff.setWorker(new Worker("Ole", "Horianinskyi", "developer", 2018));

        when(mockScan.next()).thenReturn("Ol").thenReturn("Horianinskyi").thenReturn("developer");
        when(mockScan.nextInt()).thenReturn(2018);
        staff.setWorker(new Worker("Ol", "Horianinskyi", "developer", 2018));

        when(mockScan.next()).thenReturn("O").thenReturn("Horianinskyi").thenReturn("developer");
        when(mockScan.nextInt()).thenReturn(2018);
        staff.setWorker(new Worker("O", "Horianinskyi", "developer", 2018));

        expected = Arrays.asList(
                "Worker - name: Oleks, surname: Horianinskyi, position: developer, year of entry into work: 2018.",
                "Worker - name: Olek, surname: Horianinskyi, position: developer, year of entry into work: 2018.",
                "Worker - name: Ole, surname: Horianinskyi, position: developer, year of entry into work: 2018.",
                "Worker - name: Ol, surname: Horianinskyi, position: developer, year of entry into work: 2018.",
                "Worker - name: O, surname: Horianinskyi, position: developer, year of entry into work: 2018."
        );

        for (int i = 0; i < staff.getWorkers().length; i++) {
            Assert.assertEquals(expected.get(i), staff.getWorkers()[i].toString());
        }
    }

}
