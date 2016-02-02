package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream(args [0]);
        int num = 0;
        while (in.available() > 0)
        {
            int count = in.read();
            if (count >= Integer.valueOf('A') && count <= Integer.valueOf('Z') ||
                    count >= Integer.valueOf('a') && count <= Integer.valueOf('z'))
            {
                num++;
            }
        }
        System.out.println(num);

        in.close();

    }
}
