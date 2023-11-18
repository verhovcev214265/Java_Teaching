package org.teaching.essential.lecture9_class_object.itvdn.task1;

public class Main {
    public static void main(String[] args) {

        Animal bobA = new Animal("Bob", 10, true);
        Animal sam = new Animal("Sam", 12, false);
        Animal bobB = new Animal("Bob", 10, true);

        System.out.println(
                bobA.equals(bobB) + "\n" +
                        bobA.equals(sam) + "\n" +
                        bobB.equals(sam)
        );
    }
}
