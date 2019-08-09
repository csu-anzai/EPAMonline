package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class DoubleArray14 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int m = br.nextInt();
        int n = br.nextInt();

        int arr[][] = createArr(m, n);
        System.out.println();
        outPutDArr(arr);
        System.out.println();
        int arr1[][] = isCounterNum(arr, m, n);
        outPutDArr(arr1);
    }

    public static void outPutDArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createArr(int m, int n) {

        int arr[][] = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }

    public static int[][] isCounterNum(int arr[][], int m, int n) {

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < m; i++) {

                if (count == j) {
                    arr[i][j] = 0;
                }
                if (count < j) {
                    arr[i][j] = 1;
                }
                if (count > j) {
                    arr[i][j] = 0;
                }
                if (arr[i][j] == 1) {
                    count++;
                }
            }


        }

        return arr;
    }
}
/*



 */