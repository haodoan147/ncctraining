package Collection;

// Set collection không thể chứa 2 giá trị không trùng lặp
// List collection có thứ tự, có thể lặp, truy cập chính xác bằng chỉ số
// Queue colection chứa các phần tử trước khi xử lý, FIFO
// Deque colection chứa các phần tử trước khi xử lý, FIFO và LIFO (2 chiều)
// Map là một đối tượng ánh xạ, mỗi key ánh xạ nhiều nhất 1 giá trị, không lặp

import java.lang.management.ManagementFactory;
import java.util.*;

// Iterator hasNext() next() remove()
public class CollectionExample1 {
    public static void main(String[] args) {
 /*        List <String> items = new ArrayList <String> ();
        items.add ("1");
        items.add ("2");
        items.add ("3");
        items.add ("11");
        items.add ("22");
        items.add ("123");
        Stream<String> stream = items.stream();

        // stream().filter() lọc phần từ theo điều kiện
        stream.filter(item -> item.startsWith("1")).collect(Collectors.toList()).forEach(c-> System.out.println(c));

        // stream().map() chuyển từ loại object này sang object khác
        List<Integer> numbers = items.stream().map(item->Integer.parseInt(item)).collect(Collectors.toList());
        numbers.forEach(c-> System.out.println(c.getClass().getName()+c));

        // stream().collect() thu thập kết quả từ filter(), map() dưới dạng 1 collection khác

        // reduction stream operations allow us to produce one single result from a sequence of elements,
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
//        0 is identity
//        (subtotal, element) -> subtotal + element) is accumulator
//        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result);

        String result2 = items
                .stream()
                .reduce("", (partialString, element) -> partialString + element);
//        String result2 = items.stream().reduce("", String::concat);
        System.out.println(result2);

        // ...
        String shortest = items.stream()
                .min(Comparator.comparing (item -> item.length ()))
                .get();

        long cnt = items.stream()
                .filter (item -> item.startsWith("t"))
               .count();
*/
        // ---------------------------------------------------------------------------------------
        // ArrayList mảng có kích thước thay đổi được
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

        // Vector ~ ArrayList nhưng có sẵn synchronized
        List<String> vector = new Vector<String>();
        vector.add("PHP");
        vector.add("Python");
        vector.add("Java");
        vector.add("C++");
        System.out.println("Các phần tử của Vector");
        System.out.print("\t" + vector + "\n");

        // LinkedList danh sách liên kết
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");

        // tìm hiểu thêm LinkedHashset
        // new TreeSet() sẽ sắp xếp các phần tử
        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");

        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.println("\t" + hashMap);

        // PriorityQueue: là 1 dạng queue mà trong đó các phần tử trong queue sẽ được sắp xếp.

        // ---------------------------------------------------------------------------------------
        // Demo method in Collection interface
        System.out.println(hashMap.size());
        hashMap.clear();
        System.out.println(hashMap.size());
        hashMap.put("Language4", ".Net");
        System.out.println(hashMap.size());


        // ---------------------------------------------------------------------------------------
        // Speedtest

        Thread linkedListThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // linkedList
                for (int i = 0; i < 10000000; i++) {
                    linkedList.add(i + "");
                }
                System.out.println("linkedList approach: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
                System.out.println("linkedList approach: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);
            }
        });

        Thread vectorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // vector
                for (int i = 0; i < 10000000; i++) {
                    vector.add(i + "");
                }
                System.out.println("vector approach: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
                System.out.println("vector approach: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);
            }
        });


        Thread arrayListThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // arrayList
                for (int i = 0; i < 10000000; i++) {
                    arrayList.add(i + "");
                }
                System.out.println("arrayList approach: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
                System.out.println("arrayList approach: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);
            }
        });


        Thread hashSetThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // hashSet
                for (int i = 0; i < 10000000; i++) {
                    hashSet.add(i + "");
                }
                System.out.println("hashSet approach: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
                System.out.println("hashSet approach: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);

            }
        });


        Thread hashMapThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // hashMap
                for (int i = 0; i < 10000000; i++) {
                    hashMap.put(i+"", i + "");
                }
                System.out.println("hashMap approach: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
                System.out.println("hashMap approach: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);

            }
        });


        Thread linkedListReadThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // linkedList
                for (int i = 0; i < 10000; i++) {
                    linkedList.get(i);
                }
                System.out.println("linkedList GET approach: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
                System.out.println("linkedList GET approach: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);
            }
        });

        Thread arrayListReadThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // arrayList
                for (int i = 0; i < 10000; i++) {
                    arrayList.get(i);
                }
                System.out.println("arrayList GET approach: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
                System.out.println("arrayList GET approach: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);
            }
        });
//        vectorThread.start();
//        linkedListThread.start();
//        hashMapThread.start();
//        hashSetThread.start();
//        arrayListThread.start();
////
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i+"");
            arrayList.add(i+"");
        }
        linkedListReadThread.start();
        arrayListReadThread.start();
    }

}
