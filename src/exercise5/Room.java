package exercise5;

/**
 * Class Room
 * Task 1: Create a class Room with the following private data members: String building, int number
 * @author Teboho Samuel Nteso
 * GetPrice
 */
public class Room {
    private final String Building;
    private final int number;
    
    //Constructor
    public Room(String Building, int number) {
        this.Building = Building;
        this.number = number;
    }
    public String getBuilding() {
        return this.Building;
    }
    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Room{" + "Building=" + Building + ", number=" + number + '}';
    }
    
}
    
