package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map1 = new HashMap<>();

        map1.put("Vaska",new Cat("Vaska"));
        map1.put("Shmaska",new Cat("Shmaska"));
        map1.put("Hryaska",new Cat("Hryaska"));
        map1.put("Tryaska",new Cat("Tryaska"));
        map1.put("Chvaska",new Cat("Chvaska"));
        map1.put("Oryaska",new Cat("Oryaska"));
        map1.put("sasdf",new Cat("sasdf"));
        map1.put("asdf",new Cat("asdf"));
        map1.put("dfshgjd",new Cat("dfshgjd"));
        map1.put("gjfgk",new Cat("gjfgk"));
        return map1;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> s = new HashSet<Cat>();

        {
            s.addAll(map.values());
        }
        return s;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
