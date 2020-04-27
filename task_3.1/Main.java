/*Задание 3,1: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
        Если есть - выведите 'да', а если нет - выведите 'нет'.*/

package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {9,11,3,-6,-2,5,77,56};
        Boolean have_five=false;
        for(int i=0;i<nums.length;i++) if(nums[i]==5){
            have_five=true;
            break;
        }
        System.out.println(have_five?"да":"нет");

    }
}
