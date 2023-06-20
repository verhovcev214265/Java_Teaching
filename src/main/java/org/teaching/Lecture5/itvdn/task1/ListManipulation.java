package org.teaching.Lecture5.itvdn.task1;

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

import java.util.Arrays;
import java.util.List;

public class ListManipulation {

    private static final Logger logger = LoggerFactory.getLogger(ListManipulation.class);


    private static final int ADD = 1;
    private static final int REMOVE = 2;
    private static final int SET = 3;
    private static final int INDEX = 4;
    private static final int CHECKED = 999;

    public List<Integer> changeToList(Integer[] arrNumbers){
        return Arrays.asList(arrNumbers);
    }

    public List<Integer> numbersManipulation(List<Integer> numbers, int action){

        switch (action){
            case 1 :
                numbers.add(ADD);
                break;
            case 2 :
                numbers.remove(REMOVE);
                break;
            case 3 :
                return numbers;
            case 4 :
                numbers.set(INDEX, SET);
                break;
            default:
                logger.error("You had entered non-exist action!");
        }

        return numbers;
    }

    public boolean checkElement(List<Integer> numbers, int checked){
        return numbers.contains(CHECKED);
    }
}
