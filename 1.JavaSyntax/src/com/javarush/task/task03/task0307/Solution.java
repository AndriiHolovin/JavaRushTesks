package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "ZegName1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "ZergName2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "ZergName3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "ZergName4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "ZergName5";
        Protoss protoss6 = new Protoss();
        protoss6.name = "protoss6";
        Protoss protoss7 = new Protoss();
        protoss7.name = "protoss7";
        Protoss protoss8 = new Protoss();
        protoss8.name = "protoss8";
        Terran terran9 = new Terran();
        terran9.name = "terran9";
        Terran terran10 = new Terran();
        terran10.name = "terran10";
        Terran terran11 = new Terran();
        terran11.name = "terran11";
        Terran terran12 = new Terran();
        terran12.name = "terran12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
