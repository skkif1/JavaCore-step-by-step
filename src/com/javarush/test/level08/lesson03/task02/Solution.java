package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> mass1 = new HashMap<>();
        mass1.put("арбуз",  "ягода");
        mass1.put("банан","трава");
        mass1.put("вишня","ягода");
        mass1.put("груша","фрукт");
        mass1.put("дыня","овощ");
        mass1.put("ежевика","куст");
        mass1.put("жень-шень","корень");
        mass1.put("земляника","ягода");
        mass1.put("ирис","цветок");
        mass1.put("картофель","клубень");
        Iterator<Map.Entry<String, String>> iterator = mass1.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
