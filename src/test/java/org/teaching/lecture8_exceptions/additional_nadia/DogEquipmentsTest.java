package org.teaching.lecture8_exceptions.additional_nadia;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import org.junit.Before;

import java.util.Scanner;

public class DogEquipmentsTest {
    private DogEquipments dogEquipments;
    private Scanner mockScan;

    @Before
    public void setUp() {
        mockScan = Mockito.mock(Scanner.class);

        dogEquipments = new DogEquipments();
        dogEquipments.setScan(mockScan);
    }

    @Test
    public void checkCollar_true(){
       when(mockScan.next()).thenReturn("y");
       dogEquipments.takeCollar();

       Assert.assertTrue(dogEquipments.isCollar());
    }

    @Test
    public void checkCollar_false(){
        when(mockScan.next()).thenReturn("fjksf");
        dogEquipments.takeCollar();

        Assert.assertFalse(dogEquipments.isCollar());
    }

    @Test
    public void checkLead_true(){
        when(mockScan.next()).thenReturn("y");
        dogEquipments.takeLead();

        Assert.assertTrue(dogEquipments.isLead());
    }

    @Test
    public void checkLead_False(){
        when(mockScan.next()).thenReturn("caclk");
        dogEquipments.takeLead();

        Assert.assertFalse(dogEquipments.isLead());
    }

    @Test
    public void walking_test() throws DogException {
        dogEquipments.setCollar(true);
        dogEquipments.setLead(true);

       Assert.assertEquals("Your dog has all equipments and can to walking.", dogEquipments.walking());
    }

    @Test(expected = DogException.class)
    public void shouldReturnOwnException_When_Collar_False() throws DogException {
        dogEquipments.setCollar(false);
        dogEquipments.setLead(true);

        dogEquipments.walking();
    }

    @Test(expected = DogException.class)
    public void shouldReturnOwnException_When_Lead_False() throws DogException {
        dogEquipments.setCollar(true);
        dogEquipments.setLead(false);

        dogEquipments.walking();
    }

    @Test(expected = DogException.class)
    public void shouldReturnOwnException_When_CollarAndLead_False() throws DogException {
        dogEquipments.setCollar(false);
        dogEquipments.setLead(false);

        dogEquipments.walking();
    }

}
