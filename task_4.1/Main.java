/*Задача 4.1
        Написать функцию, которая возвращает минимум из двух чисел.*/
package com.company;
public class Main {

    public static void main(String[] args) {
        int x=-34, y=-11;
        System.out.println(min_from_two(x,y));

    }

    static int min_from_two(int a, int b){
        if(a<b) return a;
        else return b;

    }
}
