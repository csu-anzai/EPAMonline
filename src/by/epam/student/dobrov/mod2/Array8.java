package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( , , , ) 1 2 n a a  a .

 -задать длину массива
 -создать массив
 -создать цикл массива с рандомными числами
 -определить  минимальное число
 -создать новый массив
 -скопировать в него новую последовательность элементов без минимального
 -выкинуть минимальный элемент из массива и вывести новую последовательность на экран

 */
public class Array8 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        System.out.println("Введите  длину массива: ");
        int n = br.nextInt();
        int mas[] = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.println(mas[i]);
        }

        System.out.println();
        int min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + min + " ");

        System.out.println();

        int counterLenght = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > min) {
                counterLenght++;
            }
        }

        System.out.println("Длина нового массива  =  " + counterLenght);

        System.out.println();

        int mas2[] = new int[counterLenght];

        int a = 0;// индекс мас2, который будет  идти  с шагом  +1 и заполнять мас2

        for (int i = 0; i < mas.length; i++) {

            if (mas[i] != min) {
                mas2[a] = mas[i];
                a ++;
            }
        }

        System.out.println("Последовательность элементов нового массива  = ");
        for (int i = 0; i < mas2.length; i++) {

            System.out.println(mas2[i] + " ");
        }

    }
}



