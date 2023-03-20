import java.util.*;

public class STUDENT {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        int a =0;
//        String str = sc.nextLine().trim();
//        for (int i = 0; i < str.length(); i++) {
//            a=i;
//            while (i<str.length() && !Character.isSpaceChar(str.charAt(i)) ){
//                i++;
//            }
//            list.add(Integer.parseInt(str.substring(a, i)));
//        }
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
//        int count=0;
//        for (int z=0; z<list.size();z++) {
//            count=0;
//            for (int j =0; j<list.size(); j++) {
//                if (j==z)
//                    continue;
//                for(int i=j+1; i<list.size();i++){
//                    if (i==z)
//                        continue;
//                    if(list.get(j).equals(list.get(i)))
//                        count++;
//                }
//            }
//            System.out.println(count);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] list = new int[n+1];

        Map<String, Integer> hashMap = new HashMap();
//        String str = sc.nextLine();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            list[i]=temp;

            if(hashMap.containsKey(temp+""))
                hashMap.put(temp+"", hashMap.get(temp+"") + 1);
            else
                hashMap.put(temp+"", 1);
        }
//        Map<String, Integer> hashMap2 = new HashMap();
//        hashMap2.put(1+"", 0);
//        for (int i = 2; i <= Collections.max(hashMap.values()); i++) {
//            hashMap2.put(i+"",i-1+hashMap2.get(i-1+""));
//            if(!hashMap.containsValue(i-1) && !hashMap.containsValue(i))
//                hashMap2.remove((i-1)+"");
//        }
        int sum=0;
        for (int i =0; i<n; i++) {
            sum = 0;
            for (String name: hashMap.keySet()) {
                if ((name).equals(""+list[i])){

                    sum+= ((hashMap.get(name)-1)*((hashMap.get(name)-1)-1))/2;
//                    sum+= hashMap2.get((hashMap.get(name)-1)+"");

                }
                else {
                    sum+= (hashMap.get(name)*(hashMap.get(name)-1))/2;
//                    sum += hashMap2.get(hashMap.get(name) + "");
                }

//                value = hashMap2.get(name).toString();
//                System.out.println(key + " " + value);
            }
            System.out.println(sum);

//            n = hashMap.get(key)-1;
//            sum+= (n*(n+1))/2;
//            System.out.print(hashMap.get(i+""));
//            hashMap.forEach((str12, int12)->sum+=hashMap2.get(int12+""));
//            System.out.println(hashMap2.get(hashMap.get(i-1+"")));
        }
//       for (String name: hashMap2.keySet()) {
//            String key = name.toString();
//            String value = hashMap2.get(name).toString();
//            System.out.println(key + " " + value);
//        }
/*         int count=0;
            for (int j =0; j<list.size(); j++) {
                for(int i=j+1; i<list.size();i++){
                    if(list.get(j).equals(list.get(i)))
                        count++;
                }
            System.out.println(count);
        }*/
    }
}
