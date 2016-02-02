package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        List <String> mass1 = new ArrayList<>();
        return mass1;

    }

    public static List  getListForSet()
    {

        List<String> mass2 = new ArrayList<>();
        return mass2;
    }

    public static List  getListForAddOrInsert()
    {
        List<String> mass3 = new LinkedList<>();
        return mass3;

    }

    public static List  getListForRemove()
    {
        List<String> mass4 = new LinkedList<>();
        return mass4;

    }
}
