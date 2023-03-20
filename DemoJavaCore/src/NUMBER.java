import java.util.Scanner;

public class NUMBER {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        List<BigInteger> arrayList = new ArrayList<>();
        arrayList.add(new BigInteger("-1"));
        arrayList.add(new BigInteger("-1"));
        BigInteger i = new BigInteger("2");
        for (; i.equals(n); i.add(BigInteger.valueOf(1))) {
            if (i % 2 == 0)
                arrayList.add(arrayList.get(i - 1).add(new BigInteger(String.)));
            else
                arrayList.add(arrayList.get(i - 1).add(new BigInteger("-i")));

        }
        if (n == 1)
            System.out.println(-1);
        else
            System.out.println(arrayList.get(i));
*/ /*       Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        if (n.compareTo(new BigInteger("1"))==0)
            System.out.println(-1);
        else{
            BigInteger one = new BigInteger("1");
            BigInteger tow = new BigInteger("2");
            BigInteger zero = new BigInteger("0");
            if(n.mod(tow).equals(zero))
                System.out.println(n.divide(tow));
            else
                System.out.println(n.add(one).divide(tow).negate());*/

//            for (BigInteger i = tow; i.compareTo(n)==-1||i.compareTo(n)==0;i = i.add(one)) {
//                next = pre.add(i);
//                pre = next;
//                i = i.add(new BigInteger("1"));
//                System.out.println("+"+i);
//                if(i.subtract(new BigInteger("1")).compareTo(n)==0){
//                    next = pre.subtract(i);
//                    System.out.println("if");
//                    break;
//                }
//                next = pre.subtract(i);
//                pre = next;
/*                if(i.mod(tow).compareTo(zero)==0)
                    next=pre.add(i);
                else
                    next=pre.subtract(i);
                pre=next;
                System.out.println(next);
            }*/
/*        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        if (n == 1)
            System.out.println(-1);
        else{
            Long pre = Long.valueOf(-1);
            Long next = Long.valueOf(-1);
            for (Long i = Long.valueOf(2); i<=n; i++) {
                if (i % 2 == 0)
                    next = pre+i;
                else
                    next = pre-i;
                pre=next;
            }
            System.out.println(next);
*///            System.out.println(arrayList.get((int) (i-1)));
//        List<Long> arrayList = new ArrayList<>();
//        arrayList.add(Long.valueOf(-1));
//        arrayList.add(Long.valueOf(-1));
//        Long i = Long.valueOf(2);
//        for (;i<=n; i++) {
//            if (i % 2 == 0)
//                arrayList.add(arrayList.get((int) (i-1))+i);
//            else
//                arrayList.add(arrayList.get((int) (i-1))-i);
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        if (n==0)
            System.out.println(-1);
        else{
            if(n%2==0)
                System.out.println(n/2);
            else
                System.out.println(((n+1)/-2));
        }
    }
}
