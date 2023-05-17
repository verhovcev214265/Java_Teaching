package org.teaching.lecture1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AddressTest {

    @Ignore
    @Test
    public void myMethod(){
        System.out.println("Hello");
    }

    @Test
    public void addressTest(){

        int index = 62022;
        String country = "Slovakia";
        String city = "Bratislava";
        String street = "Osloboditelov";
        int house = 15;
        int apartment = 123;

        Address myAddress = new Address();

        myAddress.setIndex(index);
        myAddress.setCountry(country);
        myAddress.setCity(city);
        myAddress.setStreet(street);
        myAddress.setHouse(house);
        myAddress.setApartment(apartment);

        Assert.assertNotNull(myAddress);
        Assert.assertEquals(index, myAddress.getIndex());
        Assert.assertEquals(country, myAddress.getCountry());
        Assert.assertEquals(city, myAddress.getCity());
        Assert.assertEquals(street, myAddress.getStreet());
        Assert.assertEquals(house, myAddress.getHouse());
        Assert.assertEquals(apartment, myAddress.getApartment());



//        System.out.println(myAddress.getIndex() + "\n" + myAddress.getCountry() + "\n" + myAddress.getCity() + "\n" +
//                myAddress.getHouse() + "\n" + myAddress.getApartment());
    }
}
