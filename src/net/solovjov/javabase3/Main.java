package net.solovjov.javabase3;

/**
 * Created by r3bers on 25.02.2016.
 * GeekBrains Video
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Вася", 30);
        p.hello();

        Person b = new Person("Петя",25,1800);
        b.hello();

    }
}
