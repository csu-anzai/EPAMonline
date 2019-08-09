package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class DoubleArray9 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int ln = br.nextInt();
        int cl = br.nextInt();

        int arr[][] = new int[ln][cl];

        createArr(arr, ln, cl);
        System.out.println();

        int arr1[] = findSumCl(arr, ln, cl);
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(findMaxSum(arr1));


    }

    public static int[][] createArr(int arr[][], int ln, int cl) {

        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < cl; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static int[] findSumCl(int arr[][], int ln, int cl) {
        int arrSum[] = new int[cl];
        for (int j = 0; j < cl; j++) {
            int sum = 0;
            for (int i = 0; i < ln; i++) {

                sum += arr[i][j];
            }

            arrSum[j] = sum;
        }
        return arrSum;
    }

    public static int findMaxSum(int arr1[]) {

        int max = arr1[0];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
                index = i;

            }


        }

        return index;
    }

}
// недоделана!нужной указать номер столбца
