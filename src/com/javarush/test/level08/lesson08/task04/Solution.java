package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Arnold", new Date("JUNE 1 1980"));
        map.put("Shvarnold", new Date("JUNE 1 1980"));
        map.put("Grtambold", new Date("JUNE 1 1980"));
        map.put("Strambold", new Date("JUNE 1 1980"));
        map.put("Trambolt", new Date("JUNE 1 1980"));
        map.put("Kirrbolt", new Date("JUNE 1 1980"));
        map.put("Shtraunold", new Date("JUNE 1 1980"));
        map.put("Utraumbolt", new Date("JUNE 1 1980"));
        map.put("Craunmbolrfr", new Date("FEBRUARY 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())

        {
            int s = iterator.next().getValue().getMonth();
            if (s == 5|| s == 6 || s == 7)
            {
                iterator.remove();
            }

        }
    }


    }






