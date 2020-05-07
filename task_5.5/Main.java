package com.company;
	/* Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
	 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
	 Вывести объекты на экран.
	*
	* Примечание:
	* Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
	*
	* Пример вывода:
	* Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
	* Имя: Катя, пол: женский, возраст: 55
	* Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
	...*/
	public class Main {
	    public static void main(String[] args) {
	        Human babushka1=new Human("бабушка1",false,80,null,null);
	        Human babushka2=new Human("бабушка2",false,68,null,null);
	        Human deda1=new Human("дедушка1",true,77,null,null);
	        Human deda2=new Human("дедушка2",true,79,null,null);
	        Human papa=new Human("папа",true,50,deda1,babushka1);
	        Human mama=new Human("мама",false,40,deda2,babushka2);
	        Human child1=new Human("Таня",false,7,papa,mama);
	        Human child2=new Human("Света",false,10,papa,mama);
	        Human child3=new Human("Миша",true,13,papa,mama);
	        System.out.println(babushka1.toString());
	        System.out.println(babushka2.toString());
	        System.out.println(deda1.toString());
	        System.out.println(deda2.toString());
	        System.out.println(papa.toString());
	        System.out.println(mama.toString());
	        System.out.println(child1.toString());
	        System.out.println(child2.toString());
	        System.out.println(child3.toString());
	
	    }
	    public static class Human {
	        String name;
	        Boolean sex;
	        int age;
	        Human father, mother;
	
	        public Human(String name, Boolean sex, int age, Human father, Human mother) {
	            this.name = name;
	            this.sex = sex;
	            this.age = age;
	            this.father = father;
	            this.mother = mother;
	        }
	
	
	
	        public String toString() {
	            String text = "";
	            text += "Имя: " + this.name;
	            text += ", пол: " + (this.sex ? "мужской" : "женский");
	            text += ", возраст: " + this.age;
	
	            if (this.father != null) {
	                text += ", отец: " + this.father.name;
	            }
	
	            if (this.mother != null) {
	                text += ", мать: " + this.mother.name;
	            }
	
	            return text;
	        }
	    }
	}
