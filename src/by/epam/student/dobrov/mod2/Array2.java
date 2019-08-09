package by.epam.student.dobrov.mod2;

import java.util.Scanner;


/*
Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.

-cоздание массива , ввод  нулевого элемента
-создание цикла и последовательности
-сравнение с числом Z, если больше то заменяем то за Z если меньше то оставляем
-подключить счетчик
 */
public class Array2 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        System.out.println("Индекс  массива");
        int index = br.nextInt();

        System.out.println("Число Z = ");
        float z = br.nextFloat();
        int counter = 0;

        float mass[] = new float[index];

        System.out.println("Начальное значение массива");
        mass[0] = br.nextFloat();

        for (int i = 0 ; i < index; i++) {

            mass[i]= mass[0] + i;

        }

        for (int i = 0; i < index; i++) {
            System.out.println(mass[i] + " ");
        }
        System.out.println();

       for (int i = 0; i < index; i++) {
            if (mass[i] > z) {
                mass[i] = z;
                counter++;


            }
           System.out.println(mass[i] + " ");
        }
        System.out.println("Кол-во замен = " + counter);


    }
}
