package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
       Zerg zerg1 = new Zerg();
       Zerg zerg2 = new Zerg();
       Zerg zerg3 = new Zerg();
       Zerg zerg4 = new Zerg();
       Zerg zerg5 = new Zerg();
       Zerg zerg6 = new Zerg();
       Zerg zerg7 = new Zerg();
       Zerg zerg8 = new Zerg();
       Zerg zerg9 = new Zerg();
       Zerg zerg10 = new Zerg();
        zerg1.name = "1";
        zerg1.name = "2";
        zerg1.name = "3";
        zerg1.name = "4";
        zerg1.name = "5";
        zerg1.name = "6";
        zerg1.name = "7";
        zerg1.name = "8";
        zerg1.name = "9";
        zerg1.name = "10";
        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();
       protos1.name = "1";
       protos1.name = "2";
       protos1.name = "3";
       protos1.name = "4";
       protos1.name = "5";
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";
        terran1.name = "1";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}