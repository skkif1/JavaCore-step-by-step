package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader s1 = new FileReader(reader.readLine());
        FileWriter s2 = new FileWriter(reader.readLine());
        while (s1.ready())
        {
            Character c = (char) s1.read();
            if (c.equals('.'))
            {
                c = '!';
            }
            s2.write(c);
        }

        s1.close();
        s2.close();
        reader.close();
    }
}
