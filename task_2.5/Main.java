/*Задание 2.5: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
        Отобразить размер вклада поочередно на ближайшие 5 лет.*/

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v=sc.nextDouble();
        double p=sc.nextDouble();
        for(int i=0;i<5;i++) {
            v=v+v*p/100;
            System.out.println(v);
        }

    }
}
