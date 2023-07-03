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

import java.util.List;

public class ListManipulation {

    private static final Logger logger = LoggerFactory.getLogger(ListManipulation.class);

    private List<Integer> numbers;

    public ListManipulation(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void performActions(int action, int element, int index) {
        switch (action) {
            case 1:
                append(element);
                break;
            case 2:
                delete(element);
                break;
            case 3:
                show();
                break;
            case 4:
                System.out.println(isElement(element));
                break;
            case 5:
                changeSomeElement(element, index);
                break;
            default:
                logger.error("You have entered invalid action please choose your action between 1 and 5.");
                throw new IllegalArgumentException("You have entered invalid action please choose your action between 1 and 5.");
        }
    }

    private void append(int addElement) {
        numbers.add(addElement);
    }

    private void delete(int deleteElement) {
        numbers.remove(deleteElement);
    }

    private void show() {
        System.out.println(numbers);
    }

    private boolean isElement(int element) {
        return numbers.contains(element);
    }

    private void changeSomeElement(int element, int index) {

        if (numbers.contains(element)) {
            numbers.set(index, element);
        }

        logger.error("That element doesn't exist into this list.");
        throw new IllegalArgumentException("That element doesn't exist into this list.");
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
