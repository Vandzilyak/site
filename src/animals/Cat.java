package animals;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
        speak = new SpeakLoudly();
    }



}
