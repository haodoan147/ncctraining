
public class StringObjective {
    public static void main(String[] args) {
        System.gc();
        long start = System.nanoTime();
        long startMemory = Runtime.getRuntime().freeMemory();

        String sb = new String();
//        String sb = "";
        for (int i = 0; i < 10000000; i++) {
            sb.concat(":").concat(i+"");
        }
        long duration1 = (System.nanoTime() - start);
        long memory1 = (startMemory - Runtime.getRuntime().freeMemory());
        System.out.println("Time Taken:" + duration1 / 1000000);
        System.out.println("Memory used:" + memory1 / 1000000);
    }
}
