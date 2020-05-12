package com.company;
/* Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5; */

import com.sun.source.tree.CatchTree;

public class Main {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
