package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.

-cоздание массива и его цикла  с рандомными числами
-проверка элементов массива на + - и 0;
-вывод на экран
 */
public class Array3 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int n = br.nextInt();

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        float mass[] = new float[n];

        for (int i = 0; i < n; i++) {

            mass[i] = (float) (Math.random() * (10 - (-10)) + (-10));
            System.out.println(mass[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (mass[i] > 0 && mass[i] != 0 ){
                counter1++;
            }if ((mass[i] < 0 && mass[i] != 0 )){
                counter2++;
            }else if (mass[i] == 0){
                counter3++;
            }

        }
        System.out.println("Кол-во положительных элементов " + counter1);
        System.out.println("Кол-во отрицательных элементов " + counter2);
        System.out.println("Кол-во нулевых элементов " + counter3);

    }
}
