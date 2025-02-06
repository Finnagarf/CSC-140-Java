package slotMachine;

public class SlotMachine {

    private Slot slot1;
    private Slot slot2;
    private Slot slot3;

    // Constructor to create and initialize the slots
    public SlotMachine() {
        slot1 = new Slot(Slot.Fruit.orange);
        slot2 = new Slot(Slot.Fruit.lemon);
        slot3 = new Slot(Slot.Fruit.cherry);
    }

    // Spin method to spin all three slots
    public void spin() {
        slot1.spin();
        slot2.spin();
        slot3.spin();
    }

    // Method to return the result of the spin
    public String toString() {
        return "| " + slot1 + " | " + slot2 + " | " + slot3 + " |";
    }

    // Getter methods for each slot
    public Slot getSlot1() {
        return slot1;
    }

    public Slot getSlot2() {
        return slot2;
    }

    public Slot getSlot3() {
        return slot3;
    }

    // Setter methods for each slot (optional, not strictly necessary for this case)
    public void setSlot1(Slot slot1) {
        this.slot1 = slot1;
    }

    public void setSlot2(Slot slot2) {
        this.slot2 = slot2;
    }

    public void setSlot3(Slot slot3) {
        this.slot3 = slot3;
    }
}

