package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] st = s.toCharArray();
       st[0] = Character.toUpperCase(st[0]);
        for (int i = 0; i < st.length; i++)
        {
            String a = String.valueOf(st[i]);

            if (a.equals(" "))
            {
                st[i + 1] = Character.toUpperCase(st[i + 1]);
            }
        }


        System.out.println(st);
    }


}
