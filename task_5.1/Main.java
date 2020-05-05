package com.company;
/* Помогите коту обрести имя с помощью метода setName. */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурзик");
        System.out.println(cat.getName());
    }
}
class Cat {
    private String name = "безымянный кот";
    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
}
