/*Задача 4.4
        Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
        Пример: МылаРамуМама
        РамуМамаМыла*/
        
package com.company;

public class Main {

    public static void main(String[] args) {
        String a="Мама", b="Мыла", c="Раму";
        f(a,b,c);
        f(a,c,b);
        f(b,a,c);
        f(b,c,a);
        f(c,a,b);
        f(c,b,a);
	
    }

    static void f(String a, String b, String c){
        System.out.println(a+b+c);
    }
}
