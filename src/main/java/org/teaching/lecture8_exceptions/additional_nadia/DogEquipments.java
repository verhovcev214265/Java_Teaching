package org.teaching.lecture8_exceptions.additional_nadia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/*
Создайте свой класс исключения для проверки выгула животного.
Программа должна содержать несколько методов, проверяющий экипировку животного (например: ошейник, поводок и т.д) и
результирующий метод «выгул». Если одно из требований хотя бы не выполнено, то выбросить свое исключение или же отработать
 */

public class DogEquipments {

    private static final Logger LOGGER = LoggerFactory.getLogger(DogEquipments.class);

    private Scanner scan;
    private boolean collar;
    private boolean lead;

    public void takeCollar() {
        LOGGER.info("Would you like to take a collar by your dog?\n"
                + "if yes press 'y', no any button.");
        String answer = scan.next();

        if (answer.equals("y".toLowerCase())) collar = true;
    }

    public void takeLead() {
        LOGGER.info("Would you like to take a lead by your dog?\n" +
                "if yes press 'y', no any button.");
        String answer = scan.next();

        if (answer.equals("y".toLowerCase())) lead = true;
    }

    public String walking() throws OwnException {
        if (!isCollar() || !isLead())
            throw new OwnException("Your dog haven't all equipments, and can be dangerous for people!");
        else return "Your dog has all equipments and can to walking.";
    }

    public void setScan(Scanner scan){
        this.scan = scan;
    }

    public boolean isCollar() {
        return collar;
    }

    public boolean isLead() {
        return lead;
    }

    public void setCollar(boolean collar) {
        this.collar = collar;
    }

    public void setLead(boolean lead) {
        this.lead = lead;
    }

}
