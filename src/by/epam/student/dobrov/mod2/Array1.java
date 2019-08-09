package by.epam.student.dobrov.mod2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Array1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину массива: ");
        String a = br.readLine();

        System.out.println("Введите число К: ");
        String b = br.readLine();


        int n = Integer.parseInt(a);


        int k = Integer.parseInt(b);
        int sum = 0;

        int mass[] = new int[n];

        System.out.println("Элементы массива = ");
        for (int i = 0; i < n; i++) {

            mass[i] = (int) (Math.random() * 10);

            System.out.print(mass[i] + " ");


            if (mass[i] % k == 0) {
                sum += mass[i];
            }

        }
        System.out.println();
        System.out.print(sum);

    }
}
