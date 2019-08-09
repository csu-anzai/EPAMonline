package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
- создание массива  типа double
- создания цикла  с рандомными числами
- создание счетчика( для подсчета  кол-ва чисел  на которое делится индекс)
- создание цикла ( для перебора чисел на которые будет делиться индекс)
надо учитывать что подсчет надо осуществлять с 0,  а не сразу с числа 2
 */
public class Array6 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        System.out.println("Введите индекс: ");
        int n = br.nextInt();
        double sum = 0;

        float mas[] = new float[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            mas[i] = (float) Math.random() * 10;
            System.out.println(i + ": " + mas[i] + " ");
            for (int j = 1; j <= i + 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 2){
                sum = sum + mas[i];
            }
        }
        System.out.println();
        System.out.println(sum + " ");
    }
}


