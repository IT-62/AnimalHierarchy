package Cells;

import Animals.Bird;

public abstract class BirdCell<T extends Bird> extends Cell<T>{

    private int quantityOfNests;

    public BirdCell(int quantityOfPlaces, int quantityOfNests) {
        super(quantityOfPlaces);
        this.quantityOfNests = quantityOfNests;
    }

}
