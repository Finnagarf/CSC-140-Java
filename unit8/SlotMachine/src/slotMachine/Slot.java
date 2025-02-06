package slotMachine;


import java.util.Random;

public class Slot {

    enum Fruit {
        orange, lemon, cherry
    }

    private Fruit currentFruit;

    // Constructor to set the fruitSlot with an input fruit value
    public Slot(Fruit initialFruit) {
        this.currentFruit = initialFruit;
    }

    // Spin method to set the fruit to a random one
    public void spin() {
        Random random = new Random();
        int randomIndex = random.nextInt(Fruit.values().length);
        this.currentFruit = Fruit.values()[randomIndex];
    }

    // Getter method for current fruit
    public Fruit getCurrentFruit() {
        return currentFruit;
    }

    // Setter method for the current fruit
    public void setCurrentFruit(Fruit fruit) {
        this.currentFruit = fruit;
    }

    @Override
    public String toString() {
        return currentFruit.toString();
    }
}

