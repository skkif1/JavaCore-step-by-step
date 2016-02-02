package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader s1 = new FileReader(reader.readLine());
        FileWriter s2 = new FileWriter(reader.readLine());
        String str = "";
        while (s1.ready())
        {
            char count = (char) s1.read();
            str += count;
        }
        String[] mas;
        mas = str.split(" ");


        for (String s : mas)
        {
            if (s.matches("\\d+"))
            {
                s2.write(s + " ");

            }
        }

        s1.close();
        reader.close();
        s2.close();
    }
}
