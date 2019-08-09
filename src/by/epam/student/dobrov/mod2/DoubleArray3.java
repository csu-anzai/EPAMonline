package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class DoubleArray3 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int ln = br.nextInt();
        int cl = br.nextInt();

        int arr[][] = createArr(ln, cl);
        System.out.println();
        outPutDArr(arr);
        System.out.println();


        System.out.println("Введите номер строки и номер столбца");
        int num1 = br.nextInt();
        int num2 = br.nextInt();

        System.out.println();

        findLnAndCl(arr, ln, cl, num1, num2);
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

    public static int[][] findLnAndCl(int arr[][], int ln, int cl, int num1, int num2) {

        for (int i = 0; i < ln; i++) {

            for (int j = 0; j < cl; j++) {


                if (num1 == i) {
                    System.out.println(arr[i][j] + " ");
                }


                if(num2 == j){
                    System.out.print(arr[i][j] + " ");
                }

            }

        }

        return arr;
    }


}

