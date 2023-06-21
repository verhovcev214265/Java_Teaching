package org.teaching.lecture5.additional_nadia;

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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teaching.Lecture5.aditional_nadia.ListManipulation;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThrows;

public class ListManipulationTest {

    private ListManipulation listManipulation;
    private List<Integer> numbers;

    @Before
    public void setUp(){
        listManipulation = new ListManipulation();
        numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i + 1);
        }
    }

    @Test
    public void checkSize(){
        Assert.assertEquals(5, numbers.size());
    }

   @Test
    public void shouldAddElement_ToList(){
        listManipulation.numbersManipulation(numbers, 1);
        Assert.assertTrue(numbers.contains(6));
   }

   @Test
    public void shouldRemoveElement_FromList(){
       listManipulation.numbersManipulation(numbers, 2);
       Assert.assertFalse(numbers.contains(3));
   }

   @Test
    public void shouldShow_List(){
       Assert.assertEquals(numbers, listManipulation.numbersManipulation(numbers, 3));
   }

    @Test
    public void shouldCheckElement_IntoList(){
        Assert.assertFalse(listManipulation.checkElement(numbers));
    }

    @Test
    public void shouldChangeElement_IntoList(){
        listManipulation.numbersManipulation(numbers, 4);
        Assert.assertTrue(numbers.contains(444));
    }

    @Test
    public void testNumbersManipulation_ByIllegalArgument(){
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> listManipulation.numbersManipulation(numbers,99)
        );

        String expected = "You have entered non-exist action";
        String actual = exception.getMessage();

        Assert.assertEquals(expected, actual);
    }
}
