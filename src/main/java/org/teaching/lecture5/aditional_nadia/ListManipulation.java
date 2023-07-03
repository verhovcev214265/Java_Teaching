package org.teaching.lecture5.aditional_nadia;

/*
Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
чего нужно показать меню, в котором предложить пользователю набор пунктов:
1. Добавить элемент в список;
2. Удалить элемент из списка;
3. Показать содержимое списка;
4. Проверить есть ли значение в списке;
5. Заменить значение в списке.
В зависимости от выбора пользователя выполняется
действие, после чего меню отображается снова.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulation {

    private static final Logger logger = LoggerFactory.getLogger(ListManipulation.class);

    private List<Integer> numbers;
    private Scanner sc;

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public ListManipulation(int listSize) {
        this.numbers = new ArrayList<>(listSize);
    }

    public boolean performActions(int action) {
        switch (action) {
            case 1:
                append();
                return true;
            case 2:
                delete();
                return true;
            case 3:
                show();
                return true;
            case 4:
                isElement();
                return true;
            case 5:
                changeSomeElement();
                return true;
            default:
                logger.error("You have entered invalid action please choose your action between 1 and 5.");
                return false;
        }
    }

    private void append() {
        logger.info("Enter the number:");
        String input = sc.next();
        int element = Integer.parseInt(input);

        numbers.add(element);
    }

    private void delete() {
        logger.info("Enter the number:");
        String input = sc.next();
        int element = Integer.parseInt(input);

        numbers.remove(element);
    }

    private void show() {
        logger.info("The list numbers is: {}", numbers);
    }

    private void isElement() {
        logger.info("Enter the number:");
        String input = sc.next();
        int element = Integer.parseInt(input);

        boolean result = numbers.contains(element);
        logger.info("The number you entered {} is in list: {}", element, result);
    }

    private void changeSomeElement() {

        logger.info("Enter the number to change: ");
        String input = sc.next();
        int element = Integer.parseInt(input);

        logger.info("Enter the new newValue: ");
        input = sc.next();
        int newValue = Integer.parseInt(input);

        int index = numbers.indexOf(element);
        if (index == -1){
            logger.error("The number you have entered does not exists!");
            return;
        }

        numbers.set(index, newValue);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
