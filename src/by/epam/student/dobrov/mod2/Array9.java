package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
-задать длину  массива с клавиатуры
-задать массив
-cоздание цикла с рандомными числами
-cоздание счетчика и последующего формирование его в массив с кол-ом эл-ов как  и у первого массива(различие
лишь в том что  в массиве счетчике элементы массива - это кол-во повторяющихся чисел из первого массива)
-определение максимального кол-ва повторений в массиве-счетчике
-если у массива счетчика  1 макс э-т  то длинна 2-го массива будет +1 , если максимальных-одинаковых кол-в
 повторений несколько то длина 2-го массива = + несколько
-создаем 2-ой массив с длинной  макс повторений  эл-ов у массива счетчика
-сравниваем значения  2-го массива между друг другом   и находим макс



 */
public class Array9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Задайте  длину массива  : ");
        int n = sc.nextInt();

        int mas[] = new int[n];

//------------------------------------------------------------------
        System.out.println("Массив рандомных элементов  =");
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.println(i + ": " + " " + mas[i] + " ");
        }

        System.out.println();
//----------------------------------------------------------------
        System.out.println("Массив-счетчик с кол-вом повторяющихся эл-ов первого массива = ");

        int masCounter[] = new int[n];

        for (int i = 0; i < mas.length; i++) {
            int counter = 0;
            for (int j = i; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    counter++;
                }
            }
            masCounter[i] = counter;
            System.out.println(i + ": " + " " + masCounter[i] + " ");
        }


        System.out.println();

        int maxCount = masCounter[0];

        for (int i = 0; i < masCounter.length; i++) {
            if (masCounter[i] > maxCount) {
                maxCount = masCounter[i]; //макс элемента масива счетчика
            }
        }

        System.out.println("Максимальный элемент массива счетчика = " + maxCount);

        System.out.println();
        int mas2Length = 0;
        for (int i = 0; i < masCounter.length; i++) {
            if (masCounter[i] == maxCount) {
                mas2Length++; //длина мас2
            }

        }
        System.out.println("Длинна нового массива = " + mas2Length + " ");
//---------------------------------------------------------------------
        System.out.println();

        int mas2[] = new int[mas2Length];
        int counterMas2 = 0; //индекс массива мас2

        System.out.println("2-ой массив = ");
        for (int i = 0; i < masCounter.length; i++) {

            if (masCounter[i] == maxCount) {
                mas2[counterMas2] = mas[i];
                System.out.println(i + ": " + " " + mas2[counterMas2]);
                counterMas2++;

            }

        }

        System.out.println();

        int minNum = mas2[0];
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] < minNum) {
                minNum = mas2[i];
            }

        }
        System.out.println("Минимальное  значение 2-го массива = " + minNum);

    }
}


