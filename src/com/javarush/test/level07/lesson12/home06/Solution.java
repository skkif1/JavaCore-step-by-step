package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("Vasya", true, 67);
        Human grandFather2 = new Human("Volodya", true, 67);
        Human grandMother1 = new Human("Galya", false, 67);
        Human grandMother2 = new Human("Lusya", false, 67);
        Human father1 = new Human("Vitya", true, 45, grandFather1, grandMother1 );
        Human mother1 = new Human("Sveta", false, 45, grandFather2, grandMother2 );
        Human children1 = new Human("Oksana", false, 45, father1, mother1 );
        Human children2 = new Human("Stas", true, 45, father1, mother1 );
        Human children3 = new Human("Misha", true, 45, father1, mother1 );
       System.out.println(grandFather1);
       System.out.println(grandFather2);
       System.out.println(grandMother1);
       System.out.println(grandMother2);
       System.out.println(father1);
       System.out.println(mother1);
       System.out.println(children1);
       System.out.println(children2);
       System.out.println(children3);




    }

    public static class Human
    {

          String name;
          boolean sex;
            int age;
            Human father;
              Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human (String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

       public  String toString()

        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
