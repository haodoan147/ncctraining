using System;
using System.Collections.Generic;
using System.Linq;

namespace GARDEN
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b;
            int[,] arr = new int[300, 300];
            int[] column = new int[300];
            int[,] row = new int[2, 300];

            long leftMax = 3000;
            long res = -leftMax;

            Init(out a, out b, arr);

            for (var i = 0; i < a; i++)
            {
                for (var k = 0; k < b; k++)
                {
                    column[k] = 0;
                    row[0, k] = k != 0 ? row[0, k - 1] + arr[i, k] : arr[i, k];
                }

                for (int j = i + 1; j < a; j++)
                {
                    for (int k = 0; k < b; k++)
                    {
                        row[1, k] = k != 0 ? row[1, k - 1] + arr[j, k] : arr[j, k];
                    }

                    var best = leftMax;
                    for (int k = 0; k < b; k++)
                    {
                        res = Math.Max(res, column[k] + row[0, k] + row[1, k] - best);
                        best = Math.Min(best, (k != 0 ? row[0, k - 1] + row[1, k - 1] : 0) - column[k]);
                    }

                    for (int k = 0; k < b; k++)
                    {
                        column[k] = column[k] + arr[j, k];
                    }
                }
            }

            Console.WriteLine(res);
        }

        static void Init(out int a, out int b, int[,] arr)
        {

            var lineData = Console.ReadLine().TrimEnd().Split(' ');
            a = int.Parse(lineData[0]);
            b = int.Parse(lineData[1]);

            for (int i = 0; i < a; i++)
            {
                lineData = Console.ReadLine().TrimEnd().Split(' ');
                for (int j = 0; j < b; j++)
                    arr[i, j] = int.Parse(lineData[j]);
            }
        }
    }
}