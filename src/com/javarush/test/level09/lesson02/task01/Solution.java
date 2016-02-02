package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        method2();
        StackTraceElement[] elementSteka = Thread.currentThread().getStackTrace();

        return elementSteka;

    }

    public static StackTraceElement[] method2()
    {
        method3();
        StackTraceElement[] elementStecka = Thread.currentThread().getStackTrace();
        return elementStecka;

    }

    public static StackTraceElement[] method3()
    {
        method4();
        StackTraceElement[] elementsStecka = Thread.currentThread().getStackTrace();
        return elementsStecka;

    }

    public static StackTraceElement[] method4()
    {
        method5();
        StackTraceElement[] elementsSteka = Thread.currentThread().getStackTrace();
        return elementsSteka;

    }

    public static StackTraceElement[] method5()
    {
        StackTraceElement[] elementsSteka = Thread.currentThread().getStackTrace();
        return elementsSteka;

    }
}
