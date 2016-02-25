package net.solovjov.javabase3;

/**
 * Created by r3bers on 25.02.2016.
 * Класс для Персоны
 */
class Person {

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = -1;
    }
    public void hello() {
        System.out.println("Это " + this.name + " и ему " + this.age + " лет и он ростом " + this.height + " мм!");
    }

    String name; // Имя Персоны
    int age;
    int height;
}
