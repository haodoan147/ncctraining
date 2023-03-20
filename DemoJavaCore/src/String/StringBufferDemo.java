package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        System.gc();
        long start = System.nanoTime();
        long startMemory = Runtime.getRuntime().freeMemory();

//        StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000000; i++) {
            sb.append(":").append(i);
        }
        long duration1 = (System.nanoTime() - start);
        long memory1 = (startMemory - Runtime.getRuntime().freeMemory());
        System.out.println("Time Taken:" + duration1 / 1000000);
        System.out.println("Memory used:" + memory1 / 1000000);
    }
}
