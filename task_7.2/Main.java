package com.company;
/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
(Придётся погуглить коллекции)
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Номер месяца
*/

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> m = new ArrayList<String>();
        m.add("0");
        m.add("January");
        m.add("February");
        m.add("March");
        m.add("April");
        m.add("May");
        m.add("June");
        m.add("July");
        m.add("August");
        m.add("September");
        m.add("October");
        m.add("November");
        m.add("December");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of month");
        String s = scan.next();
        System.out.println(s +" " +"is the " + m.indexOf(s) + " month");


    }
