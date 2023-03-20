package Static;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class Car extends Vehicle {
    private String name;
    private String engine;

    protected static int numberOfCars;

    public Car(String name, String engine) {
        super(4);
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    // getters and setters

//    public abstract static int getNumberOfCars(){
//        super.getWheel();
//        return numberOfCars;
//    }

    public static String getNumberOfCars(){
//        return String.valueOf(engine);
        return String.valueOf(numberOfCars);
    }

    public String getName() {
        System.out.println(numberOfCars);
        System.out.println(getNumberOfCars());
        return name;
    }

    static {
        numberOfCars = 0;
    }

    static {
        productionProcess.add("glass");
        productionProcess.add("door");
        productionProcess.add("paint");
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}