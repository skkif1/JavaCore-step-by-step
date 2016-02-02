package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> mass1 = new ArrayList<>();
        for (int i = 0; i < N; i++)
        {
            mass1.add(i, reader.readLine());
        }
        for (int i = 0; i < M ; i++)
        {
            String s = mass1.get(0);
            mass1.remove(0);
            mass1.add(N - 1  , s);
        }
        for (int i = 0; i < N; i++ )
        {
            System.out.println(mass1.get(i));
        }
    }
}
