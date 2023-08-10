package org.teaching.lecture8_exceptions.aditional_nadia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Создайте свой класс исключения для проверки выгула животного.
Программа должна содержать несколько методов, проверяющий экипировку животного (например: ошейник, поводок и т.д) и
результирующий метод «выгул». Если одно из требований хотя бы не выполнено, то выбросить свое исключение или же отработать
 */

public class DogEquipments {

    private static final Logger LOGGER = LoggerFactory.getLogger(DogEquipments.class);

    private boolean collar;
    private boolean lead;

    public void takeCollar(String answer) {
        if (answer.equals("y".toLowerCase())) collar = true;
    }

    public void takeLead(String answer) {
        if (answer.equals("y".toLowerCase())) collar = true;
    }

    public void walking(boolean collar, boolean lead) throws OwnException {
        if (!collar || !lead)
            throw new OwnException("Your dog haven't all equipments, and can be dangerous for people!");
        else LOGGER.info("Your dog has all equipments and can to walking.");
    }
}
