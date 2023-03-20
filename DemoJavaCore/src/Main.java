import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n;i++){
            list.add(getNumber());
        }
        list.forEach(c-> System.out.println(c));
    }

    public static int getNumber(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        return n+m;
    }
}
class APlusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}