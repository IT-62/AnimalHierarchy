package Cells;

import Animals.Ungulates;

public abstract class UngulatesCell<T extends Ungulates> extends Cell<T>{

    public UngulatesCell(int quantityOfPlaces) {
        super(quantityOfPlaces);
    }

}
