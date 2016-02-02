package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private  double num;
    public Money(double amount)
    {
        num = amount;
    }

    public  double getAmount()
    {
        return num;
    }

    public abstract String getCurrencyName();
}

