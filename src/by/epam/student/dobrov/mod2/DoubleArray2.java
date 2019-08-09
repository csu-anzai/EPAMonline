package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class DoubleArray2 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int ln = br.nextInt();
        int cl = br.nextInt();

        int arr[][] = new int[ln][cl];

        createArr(arr, ln, cl);

        System.out.println();
        leftRightOutput(arr, ln, cl);

        System.out.println();
        rightLeftOutput(arr, ln, cl);

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

    public static int[][] leftRightOutput(int arr[][], int ln, int cl) {

        for (int i = 0; i < ln; i++) {

            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

        return arr;
    }

    public static int[][] rightLeftOutput(int arr[][], int ln, int cl) {

        for (int i = 0; i < ln; i++) {

                System.out.print(arr[i][ln - i - 1] + " ");
            }
            System.out.println();

        return arr;
    }
}