import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GARDEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i<n*m; i++){
            list.put(i, sc.nextInt());
        }

        int sum = 0;
        int max = -999;
        for (int a=2;a<=n; a++){
            for (int b=2; b<=m; b++){
                for (int sn=0; sn<n-a+1;sn++){
                    for(int sm=0; sm<m-b+1;sm++){
                        sum = 0;
                        for (int i=sn;i<sn+a; i++){
                            for (int j=sm; j<sm+b; j++){
                                if(i>sn && j>sm && i<sn+a-1 && j<sm+b-1);
                                else
                                    sum+=list.get(i*m+j);
                            }
                        }
                        if (sum>max)
                            max=sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
