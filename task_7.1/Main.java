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
        System.out.println(isDateOdd("may 1 2013"));
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
        if(month.equals("january"))   return 1;
        if(month.equals("february"))  return 2;
        if(month.equals("march"))     return 3;
        if(month.equals("april"))   return 4;
        if(month.equals("may"))      return 5;
        if(month.equals("june"))     return 6;
        if(month.equals("july"))     return 7;
        if(month.equals("august"))   return 8;
        if(month.equals("september")) return 9;
        if(month.equals("october"))  return 10;
        if(month.equals("november"))   return 11;
        if(month.equals("december"))  return 12;
        return 0;
    }

}
