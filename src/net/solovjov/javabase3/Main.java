package net.solovjov.javabase3;

/**
 * Created by r3bers on 25.02.2016.
 * GeekBrains Video
 */
public class Main {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Person p = new Person("Вася", 30);
        p.hello();

        Person b = new Person("Петя", 25, 1800);
        b.hello();

        Musician m = new Musician("Коля", 22, 2100);
        m.hello();
        m.play();

        Musician a = new Musician("Андрей", 34);
        a.play();
        a.hello();
        System.out.println(a);

        Person g = new Musician("Сергей", 56);
        g.hello();

        System.out.println(fact(26));
    }
}
