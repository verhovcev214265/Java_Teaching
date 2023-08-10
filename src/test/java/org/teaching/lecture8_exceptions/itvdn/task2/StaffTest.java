package org.teaching.lecture8_exceptions.itvdn.task2;

import org.junit.Before;
import org.mockito.Mockito;

import java.util.Scanner;

public class StaffTest {

    private Staff staff;
    private Worker[] workers;
    private Scanner mockScan;

    @Before
    public void setUp(){
        mockScan = Mockito.mock(Scanner.class);

        staff = new Staff();
        staff.setScan(mockScan);
    }

}
