  /*Задание 2.6: Запросить у пользователя ввод числа и сохранить это число в переменную a.
        Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.*/
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println(a==10?"True":"False");

    }
}
