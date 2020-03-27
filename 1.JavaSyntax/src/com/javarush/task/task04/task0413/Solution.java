package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        String dayString = reader.readLine();
        int dayInt = Integer.parseInt(dayString);
        if(dayInt == 1){
            System.out.println("понедельник");
        }
        else if(dayInt == 2){
            System.out.println("вторник");
        }
        else  if(dayInt == 3){
            System.out.println("среда");
        }
        else if(dayInt == 4){
            System.out.println("четверг");

        }
        else if(dayInt == 5){
            System.out.println("пятница");
        }
        else  if(dayInt == 6){
            System.out.println("суббота");
        }
        else if (dayInt == 7) {
            System.out.println( "воскресенье");
        }
        else{
            System.out.println("такого дня недели не существует");
        }



    }
}