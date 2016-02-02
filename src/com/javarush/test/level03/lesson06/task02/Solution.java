package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)

    {
        int [] mass = {1,2,3,4,5,6,7,8,9,10};
        for (int num : mass)
        {
            for (int i : mass)
            {
                System.out.print(i * num + " ");

            }
            System.out.println();
        }

    }
}