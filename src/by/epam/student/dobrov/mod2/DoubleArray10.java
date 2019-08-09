package by.epam.student.dobrov.mod2;

import java.util.Scanner;
/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class DoubleArray10 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int n = br.nextInt();

        int arr[][] = new int[n][n];

        createArr(arr);
        System.out.println();


        findMainDiag(arr);

    }

    public static int[][] createArr(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                arr[i][j] = (int) (Math.random()*(10-(-10))+(-10)); //( Math.random() * (b-a) ) + a
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        return arr;
    }
    public static int[][] findMainDiag(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0){
                System.out.println(arr[i][i] + " ");
            }
        }

        return arr;
    }

}
