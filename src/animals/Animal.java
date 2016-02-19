package animals;

public class Animal implements AnimalInterface {

    Speak speak;
    public void setSpeak(Speak speak) {
        this.speak = speak;
    }



    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {

        this.name = name;
        this.age = age;
    }


    public String tryToSpeak() {
        return speak.say();

    }
}
