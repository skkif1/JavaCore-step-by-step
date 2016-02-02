package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader s1 = new FileReader(reader.readLine());
        String ss = "";
        while (s1.ready())
        {
            char s = (char) s1.read();
            ss += s;

        }
        String mass[] = new String[10000];
        mass = ss.split("\\W");
        int count = 0;
        for (String s : mass)
        {
            if (s.equals("world"))
            {
                count++;
            }
        }


        System.out.println(count);
        s1.close();
        reader.close();

    }
}
