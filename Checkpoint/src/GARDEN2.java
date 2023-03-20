import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GARDEN2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i<n*m; i++){
            list.add(sc.nextInt());
        }
//
//        getSum(list, n, m, 2, 2, 0,1);


        int sum = 0;
        int max = -999;
        for (int a=2;a<=n; a++){
            for (int b=2; b<=m; b++){
                for (int sn=0; sn<n-a+1;sn++){
                    for(int sm=0; sm<m-b+1;sm++){
                        sum = getSum(list, n, m, a, b, sn,sm);
                        if (sum>max)
                            max=sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static int getSum(List<Integer> list, int n, int m, int a, int b, int sn, int sm){
        int sum = 0;
        int max = 0;
        for (int i=sn;i<sn+a; i++){
            for (int j=sm; j<sm+b; j++){
                if(i>sn && j>sm && i<sn+a-1 && j<sm+b-1)
                    continue;
                else{
                    sum +=list.get(i*m+j);

                }
            }
        }
        return sum;
    }
}