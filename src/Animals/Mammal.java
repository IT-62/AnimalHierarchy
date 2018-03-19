package Animals;

public abstract class Mammal extends Animal {

    private int feedingPeriod;

    public Mammal(String name, String breed, int age, int feedingPeriod) {
        super(name, breed, age);
        this.feedingPeriod = feedingPeriod;
    }

}
