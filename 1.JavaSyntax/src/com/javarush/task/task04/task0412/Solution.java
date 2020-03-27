package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int num1 = Integer.parseInt(number1);
        if (num1 > 0){
            System.out.println(num1 * 2);
        }
        else if(num1 < 0){
            System.out.println(num1 + 1);
        }
        else {
            System.out.println(0);
        }

    }

}