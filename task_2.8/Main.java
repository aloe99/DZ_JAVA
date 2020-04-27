/*Задание 2,8: С помощью цикла for сформируйте строку '123456789' и запишите ее в переменную str.*/
package com.company;

public class Main {
    public static void main(String[] args) {
        String str="";
        for(int i=1;i<=9;i++) str+=i;
        System.out.println(str);
    }
}
