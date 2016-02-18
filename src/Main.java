import animals.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        Dog dog = new Dog("barsik", 12);
        Dog dog1 = new Dog("tyzik", 2);

        Cat cat = new Cat("myrchik", 15);
        Cat cat1 = new Cat("pushok", 9);

        Duck duck = new Duck("gysak", 1);
        Duck duck1 = new Duck("mudak", 5);
        Duck duck12 = new Duck("mudak", 5);

        Set<AnimalsInterface> animalsSet = new HashSet<AnimalsInterface>();
        animalsSet.add(dog);
        animalsSet.add(dog1);
        animalsSet.add(cat);
        animalsSet.add(cat1);
        animalsSet.add(duck);
        animalsSet.add(duck1);
        animalsSet.add(duck12);

        Iterator itr = animalsSet.iterator();
        while (itr.hasNext()){
            AnimalsAbstract animals = (AnimalsAbstract)itr.next();
            animals.say(animals);
        }



    }
}
