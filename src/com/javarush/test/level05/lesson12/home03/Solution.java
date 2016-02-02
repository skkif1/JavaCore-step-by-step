package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tomCat = new Cat (12, 12, "Tom");
        Dog CrissDog = new Dog (12, 12, "Criss");


    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        int pole1;
        int pole2;
        String pole3;
        public Dog (int pole1, int pole2, String pole3)
        {
            this.pole1 = pole1;
            this.pole2 = pole2;
            this.pole3 = pole3;
        }

    }
    public static class Cat
    {
        int pole1;
        int pole2;
        String pole3;
        public Cat (int pole1, int pole2, String pole3)
        {
            this.pole1 = pole1;
            this.pole2 = pole2;
            this.pole3 = pole3;
        }
    }

}
