package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new InputStreamReader(System.in));
                int rechA = scan.nextInt();
     int rechB = scan.nextInt();
     int rechC =scan.nextInt();
     scan.close();
        if(rechA<rechB+rechC && rechB<rechA+rechC && rechC<rechA+rechB)
            System.out.println("Треугольник существует.");


        else

            System.out.println("Треугольник не существует.");

        //напишите тут ваш код

    }
}