package com.company;

/* Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase(); */

public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }

    }
}
