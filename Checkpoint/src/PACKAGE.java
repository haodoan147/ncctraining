import java.math.BigDecimal ;
import java.util.*;

public class PACKAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,BigDecimal > list = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        BigDecimal  temp;
        BigDecimal  temp2;
        BigDecimal j = new BigDecimal(1);
        for (int  i =0; i<n; i++) {
            temp = sc.nextBigDecimal ();
            temp2 = sc.nextBigDecimal();
            while (temp2.compareTo(BigDecimal.valueOf(0))==1){
                list.put(j.toString(), temp);
                j = j.add(BigDecimal.ONE);
                temp2 = temp2.subtract(new BigDecimal (1+""));
            }
            sc.nextLine();
        }
        ArrayList<BigDecimal> list2 = new ArrayList<>();
        for (Map.Entry<String, BigDecimal> entry : list.entrySet()) {
            list2.add(entry.getValue());
        }
        Collections.sort(list2, new Comparator<BigDecimal>() {
            @Override
            public int compare(BigDecimal o1, BigDecimal o2) {
                return o1.compareTo(o2);
            }
        });
        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
        for (BigDecimal str : list2) {
            for (Map.Entry<String, BigDecimal> entry : list.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str.toString());
                }
            }
        }
        BigDecimal index = sc.nextBigDecimal();
        System.out.println(sortedMap);
//        System.out.println(sortedMap.values().get(index.toString()));
//        TreeMap<String, BigDecimal> sorted = new TreeMap<>(list);
//
//        sorted.forEach((str1, int1)-> System.out.println(str1+" "+int1));
//        list.sort((a, b)-> (int) (a.compareTo(b)));
//        Long m = sc.nextLong();
//        System.out.println(list..get((int)(m - 1)));

    }
}
