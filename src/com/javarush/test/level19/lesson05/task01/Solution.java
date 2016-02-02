package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileReader ss1 = new FileReader(s1);
        FileWriter ss2 = new FileWriter(s2);

        int i = 0;
        while (ss1.ready())
        {
            i++;
            int count = ss1.read();
            if (i % 2 == 0)
            {
                ss2.write(count);
            }


        }

            reader.close();
            ss1.close();
        ss2.close();

    }
}
