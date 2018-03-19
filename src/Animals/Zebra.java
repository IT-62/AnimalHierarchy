package Animals;

public class Zebra extends Ungulates {

    public String color;

    public Zebra(String name, String breed, int age, int feedingPeriod, int fingersInHoof, String color) {
        super(name, breed, age, feedingPeriod, fingersInHoof);
        this.color = color;
    }

}
