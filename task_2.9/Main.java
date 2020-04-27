/*Задание 2,9: Напишите фрагмент кода, который принимает от пользователя число и если число четное то программа
        выводит на экран число, которое больше введенного с клавиатуры на 10,
        в противном случае выводит на экран число в 10 раз больше введенного.*/
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        int a=scan.nextInt();
        System.out.println(a%2==0?a+10:a*10);

    }
}
