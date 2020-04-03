package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
   Scanner scan = new Scanner(new InputStreamReader(System.in));     //напишите тут ваш код
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
scan.close();
if(a == b && b == c){
    System.out.println(a + " " + b + " " + c);
}
else  if(a == b ){
    System.out.println(a + " " + b);
}
else if(a == c){
    System.out.println(a + " " + c);

}
else if(b == c){
    System.out.println(b + " " + c);
}
    }
}