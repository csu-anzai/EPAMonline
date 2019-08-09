package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */
public class LinearTask1 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(example(a,b,c));

    }

    public static int example(int a, int b, int c) {
        int result = ((a - 3) * b / 2) + c;
        return result;
    }
}
