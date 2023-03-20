package Static;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public void whenNumberOfCarObjectsInitialized_thenStaticCounterIncreases() {
        Car car1 = new Car("Jaguar", "V8");
        Car car2 = new Car("Bugatti", "W16");
        System.out.println(Car.numberOfCars);

        System.out.println(Car.getNumberOfCars());
        car1.numberOfCars++;
        car2.numberOfCars++;
        assertEquals(4, Car.numberOfCars);

        for (String str :
                Car.productionProcess) {
            System.out.println(str);
        }

        // demo static block
        // remove initial Car
//        for (String str :
//                Vehicle.productionProcess) {
//            System.out.println(str);
//        }

//
//        MemberOuterExample memberOuterExample = new MemberOuterExample();
//        MemberOuterExample.Inner inner = memberOuterExample.new Inner();
    }
}


