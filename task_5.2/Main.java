package com.company;
/* Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
 * Создайте объект класса Сat*/
public class Main {
    public static void main(String[] args) {
        Cat Musya=new Cat("Муся",15,5, 150);
        System.out.println(Musya.name +" "+Musya.age+" "+Musya.weight+" "+Musya.strength);
    }
}
class Cat{
    String name;
    int age, weight, strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
}
