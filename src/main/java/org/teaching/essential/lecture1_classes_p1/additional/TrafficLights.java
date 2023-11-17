package org.teaching.essential.lecture1_classes_p1.additional;

public class TrafficLights {

    public static String updateLight(String color){

        switch (color){
            case "green" :
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                return "You enter incorrect color!";
        }
    }
}
