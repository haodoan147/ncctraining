import java.util.Scanner;

class GARDEN5 {
    public static void main(String[] args) {
        int a, b;

        long leftMax = 3000;
        long res = -leftMax;

        Scanner sc = new Scanner(System.in);
        String[] lineData = sc.nextLine().trim().split(" ");
        a = Integer.parseInt(lineData[0]);
        b = Integer.parseInt(lineData[1]);

        int[][] arr = new int[a+1][b+1];
        int[] column = new int[a+1];
        int[][] row = new int[2][b+1];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                arr[i][j] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                column[j] = 0;
                row[0][j] = j != 0 ? row[0][j - 1] + arr[i][j] : arr[i][j];
            }

            for (int z = i + 1; z < a; z++) {
                for (int y = 0; y < b; y++) {
                    row[1][y] = y != 0 ? row[1][y - 1] + arr[z][y] : arr[z][y];
                }

                long best = leftMax;
                for (int y = 0; y < b; y++) {
                    res = Math.max(res, column[y] + row[0][y] + row[1][y] - best);
                    best = Math.min(best, (y != 0 ? row[0][y - 1] + row[1][y - 1] : 0) - column[y]);
                }

                for (int y = 0; y < b; y++) {
                    column[y] = column[y] + arr[z][y];
                }
            }
        }

        System.out.println(res);
    }
//
//    static List<Integer> Init(int a, int b, int[][] arr)
//    {
//        Scanner sc = new Scanner(System.in);
//        String[] lineData = sc.nextLine().trim().split(" ");
//        a = Integer.parseInt(lineData[0]);
//        b = Integer.parseInt(lineData[1]);
//
//        for (int i = 0; i < a; i++)
//        {
//            lineData = sc.nextLine().trim().split(" ");
//            for (int j = 0; j < b; j++)
//                arr[i][ j] = Integer.parseInt(lineData[j]);
//        }
//        List<Integer> list = new
//        return new ArrayList<>(){a, b};
//    }
}

