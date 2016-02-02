package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader filereader = new BufferedReader(fileReader);
        String[] mass = new String[100];
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        String s = "";
        Double value;
        while ((s = filereader.readLine()) != null)
        {

            mass = s.split(" ");
            if (map.containsKey(mass[0]))
            {
                value = map.get(mass[0]);
                map.put(mass[0], Double.parseDouble(mass[1]) + value);
            } else
            {
                map.put(mass[0], Double.parseDouble(mass[1]));
            }
        }
        Double max = Double.MIN_VALUE;
        for (Double s2 : map.values())
        {
            if (s2 > max)
            {
                max = s2;
            }
        }
        String str = null;
        for (Map.Entry<String, Double> s2 : map.entrySet())
        {
            if (max.equals(s2.getValue()))
            {
                str = s2.getKey();
            }
        }
        fileReader.close();
        filereader.close();
        System.out.println(str);
    }
}
