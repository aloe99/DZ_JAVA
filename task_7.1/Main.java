package com.company;
/*1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
  2. String date передается в формате FEBRUARY 1 2013
     Не забудьте учесть первый день года.
     Пример:
     JANUARY 1 2000 = true
     JANUARY 2 2020 = false*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {
        System.out.println(isDateOdd("May 1 2013"));
    }

    public static Boolean isDateOdd(String date)  {
        String[] words = date.split("\\s");
        int m=getNumberOfMonth(words[0]);
        int d=Integer.parseInt(words[1]);
        int y=Integer.parseInt(words[2]);
        LocalDate ddd = LocalDate.of(y,m,d);
        if(ddd.getDayOfYear()%2==0) return false;
        else return true;
    }

    public static int getNumberOfMonth(String month){
        if(month.equals("January"))   return 1;
        if(month.equals("February"))  return 2;
        if(month.equals("March"))     return 3;
        if(month.equals("April"))   return 4;
        if(month.equals("May"))      return 5;
        if(month.equals("June"))     return 6;
        if(month.equals("July"))     return 7;
        if(month.equals("August"))   return 8;
        if(month.equals("September")) return 9;
        if(month.equals("October"))  return 10;
        if(month.equals("November"))   return 11;
        if(month.equals("December"))  return 12;
        return 0;
    }

}
