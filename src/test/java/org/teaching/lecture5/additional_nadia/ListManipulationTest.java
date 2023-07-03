package org.teaching.lecture5.additional_nadia;

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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.teaching.lecture5.aditional_nadia.ListManipulation;

import java.util.List;

public class ListManipulationTest {

    private ListManipulation listManipulation;
    private List<Integer> mokList;

    @Before
    public void setUp(){
        mokList = Mockito.mock(List.class);
        listManipulation = new ListManipulation(mokList);
    }

    @Test
    public void performActions_test(){
        listManipulation.performActions(1, 10, 0);
        Mockito.verify(mokList).add(10);
    }
}
