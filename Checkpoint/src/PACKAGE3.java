import java.math.BigDecimal;
import java.util.*;

public class PACKAGE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<BigDecimal> list = new LinkedList<>();
        Map<BigDecimal, BigDecimal> treeMap = new HashMap<>();
        TreeSet<BigDecimal> set = new TreeSet<>();
        int n = Integer.parseInt(sc.nextLine());
        BigDecimal j = new BigDecimal(1);
        for (int i = 0; i < n; i++) {
            BigDecimal temp = sc.nextBigDecimal();
            BigDecimal temp2 = sc.nextBigDecimal();

            treeMap.compute(temp, (K, V)->( V==null ) ? temp2:(V.add(temp2)));
        }
        treeMap = sortByKey(treeMap);
        sc.nextLine();
        BigDecimal index = sc.nextBigDecimal();
        for ( BigDecimal key : treeMap.keySet() ) {
            if (index.compareTo(treeMap.get(key)) == -1 || index.compareTo(treeMap.get(key)) == 0) {
                System.out.println(key);
                break;
            }
            index = index.subtract(treeMap.get(key));
        }

    }
    public static Map<BigDecimal, BigDecimal>
    sortByKey(Map<BigDecimal, BigDecimal> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<BigDecimal, BigDecimal> > list
                = new LinkedList<Map.Entry<BigDecimal, BigDecimal> >(
                hm.entrySet());

        // Sort the list using lambda expression
        Collections.sort(
                list,
                (i1, i2) -> i1.getKey().compareTo(i2.getKey()));
        HashMap<BigDecimal, BigDecimal> temp
                = new LinkedHashMap<BigDecimal, BigDecimal>();
        for (Map.Entry<BigDecimal, BigDecimal> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
