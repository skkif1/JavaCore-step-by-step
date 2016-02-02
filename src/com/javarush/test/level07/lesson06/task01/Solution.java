package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> mass1 = new ArrayList<String>();

        mass1.add(0,"st");
        mass1.add(1,"str");
        mass1.add(2,"stri");
        mass1.add(3,"strin");
        mass1.add(4,"string");


            System.out.println(mass1.size());
        for (int i = 0; i < mass1.size(); i++)
        {
            System.out.println(mass1.get(i));
        }
    }
}
