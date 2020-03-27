package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(2, 23.21));
        System.out.println(convertEurToUsd(3, 23.21));        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        return(eur*course);

    }
}
