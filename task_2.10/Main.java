/*Задание 2,10: Назовем «весом числа» сумму его цифр. Напишите код, который принимает от пользователя число
        и выводит на экран его «вес».*/
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int a1=a/10, a2=a%10;
        System.out.println(a1+a2);

    }
}
