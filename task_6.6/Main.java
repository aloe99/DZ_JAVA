package com.company;
/*
Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.*/

public class Main {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
