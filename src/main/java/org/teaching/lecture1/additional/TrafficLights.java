package org.teaching.lecture1.additional;

public class TrafficLights {

    public static String updateLight(String current){
        switch (current){
            case "green" :
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                return "You enter incorrect word!";
        }
    }
}
