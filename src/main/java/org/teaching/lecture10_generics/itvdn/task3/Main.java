package org.teaching.lecture10_generics.itvdn.task3;

public class Main {
    public static void main(String[] args) {

        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.addElement("країна", "country");
        myDictionary.addElement("країна", "country");
        myDictionary.addElement("країна", "country");

        for (int i = 0; i < myDictionary.getSize(); i++) {
            System.out.println(myDictionary.getElement(i));
        }

    }
}
