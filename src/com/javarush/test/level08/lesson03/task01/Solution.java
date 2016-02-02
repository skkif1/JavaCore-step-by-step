package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз,, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> mass1 = new HashSet<>();
        mass1.add("арбуз");
        mass1.add("банан");
        mass1.add("вишня");
        mass1.add("груша");
        mass1.add("дыня");
        mass1.add("ежевика");
        mass1.add("жень-шень");
        mass1.add("земляника");
        mass1.add("ирис");
        mass1.add("картофель");
        for (String str:mass1)
        {
            System.out.println(str);
        }

    }
}
