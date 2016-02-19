import animals.*;

public class Main {

    public static void main(String[] args) {

//        HashSet<AnimalsInterface> animalsSet = new HashSet<AnimalsInterface>();
//        animalsSet.add(new LitleDog("barsik", 12));
//        animalsSet.add(new BigDog("tyzik", 2));
//        animalsSet.add(new Cat("myrchik", 15));
//        animalsSet.add(new Cat("pushok", 9));
//        animalsSet.add(new Duck("gysak", 1));
//        animalsSet.add(new Duck("mudak", 5));
//        animalsSet.add(new Duck("mudak", 5));
//
//        Iterator<AnimalsInterface> itr = animalsSet.iterator();
//        while (itr.hasNext()){
//            AnimalsInterface animals = itr.next();
//            animals.tryToSpeak();
//        }


        Animal bigDog = new BigDog("BIG_DOG", 12);
        Animal litleDog = new LitleDog("litle_dog", 1);
        Animal cat = new Cat("cat", 1);

        System.out.println("bigDog " +bigDog.tryToSpeak());
        System.out.println("litleDog "+litleDog.tryToSpeak());
        bigDog.setSpeak(new SpeakQuietly());
        System.out.println("bigDog " + bigDog.tryToSpeak());
        System.out.println("cat " +cat.tryToSpeak());
    }
}
