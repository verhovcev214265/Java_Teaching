package org.teaching.Lecture5.aditional_nadia;

/*
!!!
Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
чего нужно показать меню, в котором предложить пользователю набор пунктов:
1. Добавить элемент в список;
2. Удалить элемент из списка;
3. Показать содержимое списка;
4. Проверить есть ли значение в списке; ("boolean" it will be a separate method)
5. Заменить значение в списке.
В зависимости от выбора пользователя выполняется
действие, после чего меню отображается снова.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ListManipulation {

    private static final Logger logger = LoggerFactory.getLogger(ListManipulation.class);

    public List<Integer> numbersManipulation(List<Integer> numbers, int action) {

        switch (action) {
            case 1:
                numbers.add(6);
                break;
            case 2:
                numbers.remove(2);
                break;
            case 3:
                return numbers;
            case 4:
                numbers.set(2, 444);
                break;
            default:
                logger.error("I have entered non-exist action");
                throw new IllegalArgumentException("You have entered non-exist action");
        }
        return numbers;
    }

    public boolean checkElement(List<Integer> numbers) {
        return numbers.contains(444);
    }
}
