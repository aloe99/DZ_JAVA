/*Задание 3,2: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
        Если есть - выведите 'да', а если нет - выведите 'нет'.*/
package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums={1,3,7,5,3,2};
        Boolean is_two_equal=false;
        for(int i=0;i<nums.length-1;i++) if(nums[i]==nums[i+1]) is_two_equal=true;
        System.out.println(is_two_equal?"да":"нет");

    }
}
