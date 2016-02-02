package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
      HashSet<Integer> mass1 = new HashSet<>();
        mass1.add(1);
        mass1.add(2);
        mass1.add(3);
        mass1.add(4);
        mass1.add(5);
        mass1.add(6);
        mass1.add(7);
        mass1.add(8);
        mass1.add(9);
        mass1.add(10);
        mass1.add(11);
        mass1.add(12);
        mass1.add(13);
        mass1.add(14);
        mass1.add(15);
        mass1.add(16);
        mass1.add(17);
        mass1.add(18);
        mass1.add(19);
        mass1.add(20);
        return mass1;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext())
        {
            if (itr.next() > 10)
            {

                itr.remove();
            }
        }
            return set;
    }


}
