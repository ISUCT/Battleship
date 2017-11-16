import java.util.ArrayList;

// Rfждый класс должен находиться в своем отдельном файле
class Ship {
    // If we will use it later in other methods
    // variable should be defined here
    // and variables should have more readble naming
    private ArrayList<Integer> shipPos;
    private int shipSize = 3;

    // Each method should be started from lowerCase letter
    public ArrayList<Integer> getCords() {
        shipPos = new ArrayList<Integer>();
        // Generated started point for ship
        int x = (int) (Math.random() * 3);
        for (int i = x; i < x + shipSize; i++) {
            shipPos.add(i);
        }
        return shipPos;
    }

}