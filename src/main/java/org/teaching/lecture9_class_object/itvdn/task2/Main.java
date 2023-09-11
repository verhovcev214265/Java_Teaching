package org.teaching.lecture9_class_object.itvdn.task2;

public class Main {
    public static void main(String[] args) {

        Device deviceA = new Device("Samsung", 120.0f, "AB1234567CD");
        Device deviceB = new Device("Samsung", 120.0f, "AB1234567CD");
        Device deviceC = new Device("Apple", 120.0f, "AB1234567CD");

        Monitor monitorA = new Monitor("Samsung", 120.0f, "AB1234567CD", 1280, 1024);
        Monitor monitorB = new Monitor("Samsung", 120.0f, "AB1234567CD", 1280, 1024);
        Monitor monitorC = new Monitor("Apple", 120.0f, "AB1234567CD", 1280, 1024);

        InternetAdapter internetAdapterA = new InternetAdapter(
                "Samsung", 120.0f, "AB1234567CD",65, "3CD469F3-40D7-439A-AD9B-AA5B4A4E2B6C"
        );
        InternetAdapter internetAdapterB = new InternetAdapter(
                "Samsung", 120.0f, "AB1234567CD",65, "3CD469F3-40D7-439A-AD9B-AA5B4A4E2B6C"
        );
        InternetAdapter internetAdapterC = new InternetAdapter(
                "Samsung", 120.0f, "AB1234567CD",65, "2CD469F3-40D7-439A-AD9B-AA5B4A4E2B6C"
        );

        System.out.println(
                deviceA.equals(deviceB) + ".\n" +                          // t
                        deviceA.equals(deviceC) + ".\n" +                  // f
                        monitorA.equals(monitorB) + ".\n" +                // t
                        monitorA.equals(monitorC) + ". \n" +               // f
                        internetAdapterA.equals(internetAdapterB) + "\n" + // t
                        internetAdapterA.equals(internetAdapterC)          // f
        );
    }
}
