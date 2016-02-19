package animals;

public class LitleDog extends Animal {


    public LitleDog(String name, int age) {
        super(name, age);
        speak = new SpeakQuietly();
    }



}
