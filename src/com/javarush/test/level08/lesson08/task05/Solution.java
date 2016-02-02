package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
       HashMap<String, String> mass1 = new HashMap<>();
        mass1.put("1","1");
        mass1.put("2","2");
        mass1.put("3","3");
        mass1.put("4","4");
        mass1.put("5","5");
        mass1.put("6","6");
        mass1.put("7","7");
        mass1.put("8","8");
        mass1.put("9","8");
        mass1.put("10","10");
return mass1;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

      ArrayList<String> mass1 = new ArrayList<>(map.values());
      ArrayList<String> mass2 = new ArrayList<>(map.values());
            for (String s1 : mass1)
            {
                int count = 0;
                for(String st2 : mass2)
                {

                    if (s1.equals(st2))
                    {
                        count++;
                    }
                    if (count > 1)
                    {
                        removeItemFromMapByValue(map, s1);

                    }
                }
            }




    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
