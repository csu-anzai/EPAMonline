package by.epam.student.dobrov.mod1;

import java.util.Scanner;
/*
Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Cycle2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Введите начальное число = ");
        int a = sc.nextInt();

        System.out.print("Введите конечное число = ");
        int b = sc.nextInt();

        System.out.print("Введите шаг = ");
        int h = sc.nextInt();


        for (int x = a; x <= b; x += h) {
            if (x > 2 ){
                System.out.println(x);
            }else if (x <= 2){
                System.out.println(-x);
            }

        }
    }

}
