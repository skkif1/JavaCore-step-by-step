package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fin;
    AdapterFileOutputStream (FileOutputStream fin)
    {
        this.fin = fin;
    }

    @Override
    public void flush() throws IOException
    {
    this.fin.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
        this.fin.write(s.getBytes());
    }

    @Override
    public void close() throws IOException
    {
        this.fin.close();
    }
}

