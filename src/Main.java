import animals.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        AnimalsInterface dog = new Dog("barsik", 12);
        AnimalsInterface dog1 = new Dog("tyzik", 2);

        AnimalsInterface cat = new Cat("myrchik", 15);
        AnimalsInterface cat1 = new Cat("pushok", 9);

        AnimalsInterface duck = new Duck("gysak", 1);
        AnimalsInterface duck1 = new Duck("mudak", 5);
        AnimalsInterface duck12 = new Duck("mudak", 5);

        Set<AnimalsInterface> animalsSet = new HashSet<AnimalsInterface>();
        animalsSet.add(dog);
        animalsSet.add(dog1);
        animalsSet.add(cat);
        animalsSet.add(cat1);
        animalsSet.add(duck);
        animalsSet.add(duck1);
        animalsSet.add(duck12);

        Iterator<AnimalsInterface> itr = animalsSet.iterator();
        while (itr.hasNext()){
            AnimalsInterface animals = itr.next();
            animals.say();
        }



    }
}
