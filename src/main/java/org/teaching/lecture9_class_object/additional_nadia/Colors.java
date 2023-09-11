package org.teaching.lecture9_class_object.additional_nadia;

public enum Colors {

    BLACK("black"), RED("red"), BLUE("blue"), WHITE("white");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return color;
    }


}
