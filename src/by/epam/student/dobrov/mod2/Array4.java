package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

-cоздание массива и его цикла  с рандомными числами
-определение наибольшего и наименьшего элемента
-замена их местами c помощью  индексов
-вывод на экран
 */
public class Array4 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        System.out.println("Введите Индекс: ");
        int n = br.nextInt();

        float mass[] = new float[n];

        int indexMax = 0;
        int indexMin = 0;
        float temp = 0;

        for (int i = 0; i < n; i++) {

            mass[i] = (float) (Math.random() * 10);
            System.out.println( i + ": " + mass[i] + " ");
        }
        System.out.println();

        float min =mass[0];
        float max =mass[0];


        for (int i = 0; i < n; i++) {
            if (mass[i] > max) {
                max = mass[i];
                indexMax = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (mass[i] < min) {
                min = mass[i];
                indexMin = i;
            }
        }

        System.out.println("Максимальное число " + max);
        System.out.println("Индекс максимального числа " + indexMax);

        System.out.println();

        System.out.println("Минимальное число " + min);
        System.out.println("Индекс минимального числа " + indexMin);

        System.out.println();

        temp = mass[indexMin];
        mass[indexMin] = mass[indexMax];
        mass[indexMax] = temp;

        for (int i = 0; i < n; i++) {
            System.out.println( i + ": " + mass[i] + " ");
        }
    }
}
