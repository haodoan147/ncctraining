import java.util.*;

public class STUDENT {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> hashMap = new HashMap<>();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            list.add(temp);

            if(hashMap.containsKey(temp+""))
                hashMap.put(temp+"", hashMap.get(temp+"") + 1);
            else
                hashMap.put(temp+"", 1);
        }
        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put(1+"", 0);
        for (int i = 2; i <= Collections.max(hashMap.values()); i++) {
            hashMap2.put(i+"",i-1+hashMap2.get(i-1+""));
            if(!hashMap.containsValue(i-1) && !hashMap.containsValue(i))
                hashMap2.remove((i-1)+"");
        }
        Integer sum;
        for (Integer i:list) {
            sum = 0;
            for (String name: hashMap.keySet()) {
                if ((name).equals(""+i)){

//                    sum+= ((hashMap.get(name.toString())-1)*((hashMap.get(name.toString())-1)-1))/2;
                    sum+= hashMap2.get((hashMap.get(name)-1)+"");

                }
                else {
//                    sum+= (hashMap.get(name.toString())*(hashMap.get(name.toString())-1))/2;
                    sum += hashMap2.get(hashMap.get(name) + "");
                }
            }
            System.out.println(sum);
        }*/
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int temp;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            list.add(temp);
        }
//        int count=0;
//        ArrayList<Integer> subList = new ArrayList<>();
//        for (int z=0; z<list.size();z++) {
//            subList=new ArrayList<>(list);
//            subList.remove(list.get(z));
//            count=0;
//            for (int j =0; j<subList.size(); j++) {
//                for(int i=j+1; i<subList.size();i++){
//                    if(subList.get(j).equals(subList.get(i)))
//                        count++;
//                }
//            }
//            System.out.println(count);
//        }
        int count=0;
        for (int z=0; z<list.size();z++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (j == z)
                    continue;
                for (int i = j + 1; i < list.size(); i++) {
                    if (i == z)
                        continue;
                    if (list.get(j).equals(list.get(i)))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
