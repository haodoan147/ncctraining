package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Subtest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
//        System.out.println("Các phần tử của ArrayList");
//        System.out.print("\t" + arrayList + "\n");
        long start = System.nanoTime();
        long startMemory = Runtime.getRuntime().freeMemory();

        long duration1 = (System.nanoTime() - start);
        long memory1 = (startMemory - Runtime.getRuntime().freeMemory());

        // Vector ~ ArrayList nhưng có sẵn synchronized
        List<String> vector = new Vector<String>();
        vector.add("PHP");
        vector.add("Python");
        vector.add("Java");
        vector.add("C++");
//        System.out.println("Các phần tử của Vector");
//        System.out.print("\t" + vector + "\n");

        // vector
        start = System.nanoTime();
        startMemory = Runtime.getRuntime().freeMemory();

        for (int i = 0; i < 10000000; i++) {
            vector.add(i + "");
        }
        duration1 = (System.nanoTime() - start);
        memory1 = (Runtime.getRuntime().freeMemory() - startMemory);
//        System.out.println("Time vector Taken:" + duration1 / 1000000);
//        System.out.println("Memory vector used:" + memory1 / 1000000);

        // arrayList
        start = System.nanoTime();
        startMemory = Runtime.getRuntime().freeMemory();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i + "");
        }
        duration1 = (System.nanoTime() - start);
        memory1 = (Runtime.getRuntime().freeMemory() - startMemory);
        System.out.println("Time arrayList Taken:" + duration1 / 1000000);
        System.out.println("Memory arrayList used:" + memory1 / 1000000);
    }
}
