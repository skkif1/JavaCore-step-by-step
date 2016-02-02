package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Integer[] mass1 = new Integer[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mass1.length; i++)
        {
            mass1[i] = Integer.parseInt(reader.readLine());
        }

        Integer[] mass2 = new Integer[10];
        for (int i = 0; i < mass1.length; i++)

        {
            mass2[mass2.length -1 - i] = mass1[i];
        }
            mass1 = mass2;
            for (int i = 0; i < mass1.length; i++)
            {
                System.out.println(mass1[i]);
            }
    }
}
