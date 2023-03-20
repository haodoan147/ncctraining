package Static;

import java.util.LinkedList;
import java.util.List;

public class Vehicle {
    private int wheel = 4;

    public static List<String> productionProcess = new LinkedList<>();

    static {
        productionProcess.add("material");
        productionProcess.add("frame");
    }

    public Vehicle(int wheel) {
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
