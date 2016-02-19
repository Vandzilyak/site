package animals;

public class BigDog extends Animal {


    public BigDog(String name, int age) {
        super(name, age);
        speak = new SpeakLoudly();
    }



}
