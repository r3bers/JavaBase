package net.solovjov.javabase3;

/**
 * Created by r3ber on 25.02.2016.
 * Наследник Person
 */
public class Musician extends Person {
    public Musician(String name, int age, int height) {
        super(name, age, height);
    }

    public Musician(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println(this.name + " играет!");
    }

    @Override
    public String toString() {
        return this.name + " возраст " + this.age + " рост " + this.height + " мм.";
    }

    @Override
    public void hello() {
        super.hello();
        System.out.println("Привет, я музыкант " + this.name + " ростом " + this.height + " и мне  " + this.age + ".");
    }
}
