package Animals;

public abstract class Bird extends Animal {

    public int wingspan;

    public Bird(String name, String breed, int age, int wingspan ) {
        super(name, breed, age);
        this.wingspan = wingspan;
    }

}
