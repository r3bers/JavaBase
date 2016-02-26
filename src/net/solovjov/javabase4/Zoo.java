package net.solovjov.javabase4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by r3bers on 26.02.2016.
 * Наш зоопарк.
 */
public class Zoo {
    public static void main(String[] args) {
        List<Being> zoo;
        zoo = new ArrayList();
        zoo.add(new Plant());
        zoo.add(new Pinguin());
        zoo.add(new Crow());
        zoo.add(new Fly());

        for (Being b:zoo){
            if (b instanceof Flying)
                ((Flying) b).fly();
        }
    }
}
