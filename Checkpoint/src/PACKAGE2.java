import java.math.BigDecimal;
import java.util.*;

public class PACKAGE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<BigDecimal > list = new LinkedList<>();

        TreeSet<BigDecimal>set = new TreeSet<>();
        int n = Integer.parseInt(sc.nextLine());
        BigDecimal  temp;
        BigDecimal  temp2;
        BigDecimal j = new BigDecimal(1);
        for (int  i =0; i<n; i++) {
            temp = sc.nextBigDecimal ();
            temp2 = sc.nextBigDecimal();
            while (temp2.compareTo(BigDecimal.valueOf(0))==1){
                list.add(temp);
//                set.add(temp);
//
//                if (index.compareTo(BigDecimal.ONE)==0){
////                    System.out.println(set.first());
//                    i=n;
//                    break;
//                }
//                index = index.subtract(BigDecimal.ONE);
//                list.removeFirst();
                j = j.add(BigDecimal.ONE);
                temp2 = temp2.subtract(new BigDecimal (1+""));
            }
            sc.nextLine();
        }
        BigDecimal index = sc.nextBigDecimal();
        Collections.sort(list);
        while (index.compareTo(BigDecimal.ONE)!=0){
            list.pop();
            index = index.subtract(BigDecimal.ONE);
        }
        System.out.println(list.getFirst());
//        TreeMap<String, BigDecimal> sorted = new TreeMap<>(list);
//
//        sorted.forEach((str1, int1)-> System.out.println(str1+" "+int1));
//        list.sort((a, b)-> (int) (a.compareTo(b)));
//        Long m = sc.nextLong();
//        System.out.println(list..get((int)(m - 1)));

    }
}
