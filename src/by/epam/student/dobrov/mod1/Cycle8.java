package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
12345
34567
345
*/
public class Cycle8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

//---------------------------—


        int masNum1[] = parser(num1);
        int masNum2[] = parser(num2);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < masNum1.length; j++) {

                if (i == masNum1[j]) {

                    for (int k = 0; k < masNum2.length; k++) {

                        if (i == masNum2[k]) {
                            System.out.println(i);
                            break;
                        }
                    }
                    break;
                }

            }
        }
    }


    public static int[] parser(int num) {
        int a = num;
        int counter = 0;
        int digit = 0;

        while (a != 0) {
            a /= 10;
            counter++;
        }

//----------------------------------—
        int mas[] = new int[counter];
        a = num;
        for (int i = 0; i < counter; i++) {
            digit = a % 10;
            a /= 10;
            mas[i] = digit;

        }
        return mas;
    }
}