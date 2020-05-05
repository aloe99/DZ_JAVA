  
package com.company;
/* Создать class Dog. У собаки должна быть кличка String name и возраст int age.
 * Создайте геттеры и сеттеры для всех переменных класса Dog.
 * Создайте объект Dog*/
public class Main {
    public static void main(String[] args) {
        Dog sobaka=new Dog("Жучка", 2);
        System.out.println(sobaka.getName()+ " " + sobaka.getAge());
        sobaka.setName("Бобик");
        sobaka.setAge(4);
        System.out.println(sobaka.getName()+ " " + sobaka.getAge());

    }
}
class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
