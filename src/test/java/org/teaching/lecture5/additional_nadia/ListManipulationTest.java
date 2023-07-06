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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.mockito.Mockito.when;

public class ListManipulationTest {

    private ListManipulation listManipulation;
    private Scanner scan;
    private List<Integer> numbers;

    @Before
    public void setUp() {
        listManipulation = new ListManipulation();

        numbers = listManipulation.getNumbers();

        for (int i = 0; i < 3; i++) {
            numbers.add(i + 1);
        }

        scan = Mockito.mock(Scanner.class);
        listManipulation.setScan(scan);

        when(scan.next()).thenReturn("44");
    }

    @Test
    public void append_test() {
        when(scan.next()).thenReturn("54");

        boolean added = listManipulation.performActions(1);

        Assert.assertEquals(4, numbers.size());
        Assert.assertEquals(54, (int) numbers.get(3));
        Assert.assertTrue(added);
    }

    @Test
    public void delete_test() {
        when(scan.next()).thenReturn("999");

        boolean added = listManipulation.performActions(1);

        Assert.assertEquals(4, numbers.size());
        Assert.assertEquals(999, (int) numbers.get(3));
        Assert.assertTrue(added);

        boolean deleted = listManipulation.performActions(2);

        Assert.assertEquals(3, numbers.size());
        Assert.assertEquals(-1, listManipulation.getNumbers().indexOf(999));
        Assert.assertTrue(deleted);
    }

    @Test
    public void show_test(){
        boolean showed = listManipulation.performActions(3);

        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            expected.add(i + 1);
        }

        Assert.assertTrue(showed);
        Assert.assertEquals(expected, listManipulation.getNumbers());
    }

    @Test
    public void isElement_test(){
        when(scan.next()).thenReturn("2");

        boolean wasElement = listManipulation.performActions(4);

        Assert.assertEquals(2, (int) numbers.get(1));
        Assert.assertTrue(wasElement);
        Assert.assertTrue(listManipulation.performActions(4));

        Assert.assertEquals(-1, listManipulation.getNumbers().indexOf(22));
        Assert.assertFalse(listManipulation.getNumbers().contains(22));
    }

    @Test
    public void changeSomeElement_test(){
        when(scan.next()).thenReturn("3", "99");

        boolean changed = listManipulation.performActions(5);

        Assert.assertTrue(changed);
        Assert.assertEquals(99, (int) numbers.get(2));

    }

    @Test
    public void defaultAction_test(){
        Assert.assertFalse(listManipulation.performActions(6));
    }


}
