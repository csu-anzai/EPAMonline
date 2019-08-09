package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class DoubleArray1 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int ln = br.nextInt();
        int cl = br.nextInt();

        int arr[][] = new int[ln][cl];

        createArr(arr, ln, cl);
        System.out.println();

        checkNumOfOddCl(arr, ln, cl);
        System.out.println();


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

    public static int[][] checkNumOfOddCl(int arr[][], int ln, int cl) {


        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < cl; j++) {
                if (j % 2 != 0) {
                    if (arr[0][j] > arr[ln - 1][j]) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
        return arr;
    }


}