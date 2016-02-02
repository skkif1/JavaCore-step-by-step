package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        readData();
    }

    public static void readData() throws IOException
    {
        ArrayList<Integer> mass1 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            try
        {
           for (int i = 100; i > 0;)
           {

               mass1.add(Integer.parseInt(reader.readLine()));
           }

        }
        catch (NumberFormatException e)
        {
            for (int i = 0; i < mass1.size(); i++ )
            System.out.println(mass1.get(i));
        }
    }




}
