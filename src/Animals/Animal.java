package Animals;

public abstract class Animal {

    private String name;
    private String classification;
    private int age;

    public Animal (String name, String breed, int age) {
        this.name = name;
        this.classification = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }

    public int getAge() {
        return age;
    }
}
