package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Даны действительные числа a1,a2,.....an . Найти
max(a1 + a2n, a2 + a2n-1, ..... , an + an+1
 */
public class Array7 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        System.out.println("Введите длину: ");
        int n = br.nextInt();

        int mas1[] = new int[n * 2];

        int mas2[] = new int[n];

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 10);
            System.out.println(mas1[i]);
        }

        System.out.println();

        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = mas1[i] + mas1[(2 * n)  - i  ];

            System.out.println(mas2[i]);
        }
    }

}
