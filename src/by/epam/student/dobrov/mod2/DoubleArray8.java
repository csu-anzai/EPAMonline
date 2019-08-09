package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class DoubleArray8 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        System.out.println("Введите р-р матрицы: ");
        int ln = br.nextInt();
        int cl = br.nextInt();

        int arr[][] = new int[ln][cl];

        createArr(arr, ln, cl);
        System.out.println();

        System.out.println("Введите номера столбцов: ");
        int num1 = br.nextInt();
        int num2 = br.nextInt();


        System.out.println();
        changeColumn(arr, ln, cl, num1,num2);
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



    public static int[][] changeColumn(int arr[][], int ln, int cl, int num1, int num2) {
        int temp = 0;

        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < cl; j++) {
                temp = arr[i][num1];
                arr[i][num1] = arr[i][num2];
                arr[i][num2] = temp;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }
}
