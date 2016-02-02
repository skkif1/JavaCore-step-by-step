package com.javarush.test.level05.lesson12.home05;


/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.applet.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        int c = 0;
        int sum = 0;
        boolean i = true;

       while (i = true)
       {
           String a = reader.readLine();
           if (a.equals("сумма"))
           {
               System.out.println(c);
               break;
           }
           else
                b = Integer.parseInt(a);
                c = c + b;
       }
       }

}
