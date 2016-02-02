package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public  static  int max (int n, int h)
    {
        if(n > h)
            return n;
        else return h;
    }
    public static long max (long n, long h)
    {
        if(n > h)
            return n;
        else return h;
    }
    public static double max (double n, double h)
    {
        if(n > h)
            return n;
        else return h;
    }
}