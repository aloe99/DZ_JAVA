/*Задача 4.2
        Написать функцию, которая возвращает минимум из трёх чисел.*/
package com.company;

public class Main {

    public static void main(String[] args) {
        int x=16, y=175, z=6;
        System.out.println(min_from_3(x,y,z));

    }

    static int min_from_3(int a, int b, int c){
        if(a<b && a<c) return a;
        else if (b<a && b<c) return  b;
        else return c;

    }
}
