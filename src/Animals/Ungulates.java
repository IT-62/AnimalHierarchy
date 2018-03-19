package Animals;

public abstract class Ungulates extends Mammal {

    private int fingersInHoof;

    public Ungulates(String name, String breed, int age, int feedingPeriod, int fingersInHoof) {
        super(name, breed, age, feedingPeriod);
        this.fingersInHoof = fingersInHoof;
    }

}
