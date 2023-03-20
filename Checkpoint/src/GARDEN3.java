// Java implementation of the approach
import java.util.*;

class GFG
{
    public static int maximalSquare(int[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int maxsqlen = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    int sqlen = 1;
                    boolean flag = true;
                    while (sqlen + i < rows && sqlen + j < cols && flag) {
                        for (int k = j; k <= sqlen + j; k++) {
                            if (matrix[i + sqlen][k] == '0') {
                                flag = false;
                                break;
                            }
                        }
                        for (int k = i; k <= sqlen + i; k++) {
                            if (matrix[k][j + sqlen] == '0') {
                                flag = false;
                                break;
                            }
                        }
                        if (flag)
                            sqlen++;
                    }
                    if (maxsqlen < sqlen) {
                        maxsqlen = sqlen;
                    }
                }
            }
        }
        return maxsqlen * maxsqlen;
    }


    // Driver code
    public static void main(String[] args)
    {
        int [][] A = {
//                { -5, -9, 9 },
//                { -8, -6, 7 },
//                { -10, 7, 5 }
                { 1, 1, 1, 1 },
                { 1, -5, -5, 1 },
                { 1, 1, 1, 1 },
                { -100, -100, -100, -100 },
        };
        int [][] B = {
                { -5, -9, 9 },
                { -8, -6, 7 },
                { -10, 7, 5 },
                };
        int [][] C = {
                { -5, -9, 9 },
                { -8, -6, 7 },
                { -10, 7, 5 },
        };
//                { '1', '1', '1', '1' },
//                { '1', '-5', '-5', '1' },
//                { 1, 1, 1, 1 },
//                { -100, -100, -100, -100 },
        };
//        System.out.print(maximalSquare(A));
    }




// This code is contributed by PrinciRaj1992
