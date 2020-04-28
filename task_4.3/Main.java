/*Задача 4.3
Написать функцию, которая возвращает минимум из четырёх чисел.
 Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b) (которую вы разработали в задаче 4.1).*/

package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(min_from_4(23,67,-10,-4));

    }

    static int min_from_two(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    static int min_from_4(int a, int b, int c, int d) {
        int minAB=min_from_two(a,b);
        int minCD=min_from_two(c,d);
        return min_from_two(minAB,minCD);
    }
}
