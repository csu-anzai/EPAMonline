package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class DoubleArray15 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int m = br.nextInt();
        int n = br.nextInt();

        int arr[][] = createArr(m, n);
        System.out.println();
        outPutDArr(arr);

        System.out.println();

        int num = findMaxNum(arr, m, n);
        System.out.println(num);

        System.out.println();
        int arr1[][] = changeOddNum(arr,m,n,num);
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
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    public static int findMaxNum(int arr[][], int m, int n) {
        int max = arr[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
        }
        return max;
    }

    public static int[][] changeOddNum(int arr[][], int m, int n, int num) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ( arr[i][j] %2 !=0){
                    arr[i][j] = num;
                }
            }
        }
        return arr;
    }
}
