package animals;

public class Duck extends Animal {


    public Duck(String name, int age) {
        super(name, age);
        speak = new SpeakQuietly();
    }



}
