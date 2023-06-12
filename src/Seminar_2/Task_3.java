package Seminar_2;

import java.util.Arrays;

//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
//Пример:
//Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
//Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
//Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
public class Task_3 {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int[] newarray = NewArray(array, SummIndex(array));
        System.out.println(Arrays.toString(newarray));

    }

    /**
     *
     * @param array  Массив в котором ищем индексы двухзначных чисел
     * @return сумму индексов двухзначных чисел в массиве
     */
    static int SummIndex(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 || array[i] <= -10) {
                a = a + i;
            }
        }
        return a;
    }


    /**
     * @param array Массив в котором меняем отрицательные чила
     * @param a     сумма индексов двухзначных чисел в массиве
     * @return возвращаем измененный массив
     */
    static int[] NewArray(int[] array, int a) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0)
                array[j] = a;
        }
        return array;
    }

}
