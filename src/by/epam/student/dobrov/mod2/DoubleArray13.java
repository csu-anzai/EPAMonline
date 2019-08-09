package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */
public class DoubleArray13 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int ln = br.nextInt();
        int cl = br.nextInt();

        int arr[][] = createArr(ln, cl);
        System.out.println();
        outPutDArr(arr);
        System.out.println();
        int arr1[][] = increaseSortArr(arr, ln, cl);
        outPutDArr(arr1);
        System.out.println();
        int arr2[][] = reduceSortArr(arr, ln, cl);
        outPutDArr(arr2);
    }

    public static void outPutDArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createArr(int ln, int cl) {

        int arr[][] = new int[ln][cl];


        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < cl; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }

    public static int[][] increaseSortArr(int arr[][], int ln, int cl) {
        int temp;
        for (int j = 0; j < cl; j++) {
            for (int i = 0; i < ln; i++) {
                for (int k = i + 1; k < ln; k++) {
                    if (arr[i][j] > arr[k][j]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = temp;
                    }
                }
            }

        }
        return arr;
    }

    public static int[][] reduceSortArr(int arr[][], int ln, int cl) {
        int temp;

        for (int j = 0; j < cl; j++) {
            for (int i = 0; i < ln; i++) {
                for (int k = i + 1; k < ln; k++) {
                    if (arr[i][j] < arr[k][j]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = temp;
                    }
                }
            }
        }
        return arr;
    }

}
