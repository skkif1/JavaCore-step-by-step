package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {

        TestThread t1 = new TestThread();
        t1.run();
        t1.interrupt();


    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {


    }
}
