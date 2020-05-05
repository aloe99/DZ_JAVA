package com.company;

/*Реализовать метод boolean fight(Cat anotherCat):реализовать механизм драки котов в зависимости от их веса, возраста и силы. Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет. Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true, то cat2.fight(cat1) должен возвращать false. */
public class Main {
    public static void main(String[] args) {
        Cat cat1=new Cat(15,6,100);
        Cat cat2=new Cat(15,5,150);
        //Первый кот напал на второго
        if(cat1.fight(cat2)) System.out.println("Победил котик 1");
        else System.out.println("Победил котик 2");
        //Второй кот напал на первого
        if(cat2.fight(cat1)) System.out.println("Победил котик 2");
        else System.out.println("Победил котик 1");

    }
}
class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int thisWin=0;
        int anotherWin=0;
        if(this.age > anotherCat.age) thisWin++;
        if(this.age < anotherCat.age) anotherWin++;
        if(this.weight > anotherCat.weight) thisWin++;
        if(this.weight < anotherCat.weight) anotherWin++;
        if(this.strength > anotherCat.strength) thisWin++;
        if(this.strength < anotherCat.strength) anotherWin++;
        if(thisWin >= anotherWin) return true;
        else return false;
    }


}
