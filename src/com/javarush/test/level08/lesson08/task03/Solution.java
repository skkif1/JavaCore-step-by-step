package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
       HashMap<String, String> mass1 = new HashMap<>();
        mass1.put("Ivanov","Ivan");
        mass1.put("Suroviy","Ivan");
        mass1.put("Nesurovy","Ivan");
        mass1.put("Strogiy","Ivan");
        mass1.put("Strogayshiy","Ivan");
        mass1.put("Grozniy","Ivan");
        mass1.put("OchenStrogiq","Ivan");
        mass1.put("Ochen Suroviy","Ivan");
        mass1.put("SamiySuroviy","Ivan");
        mass1.put("Proso","Ivan");
        return mass1;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
       int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String s = pair.getValue();
            if (s.equals(name))
            {
                count++;
            }

        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {

            String s = pair.getKey();
            if (s.equals(lastName))
            {
                 count++;
            }
        }
            return count;
    }
    public static void main (String [] args)
    {
        System.out.println(getCountTheSameFirstName(createMap(), "Ivan"));
        System.out.println(getCountTheSameLastName(createMap(), "Ivanov"));
    }
}
