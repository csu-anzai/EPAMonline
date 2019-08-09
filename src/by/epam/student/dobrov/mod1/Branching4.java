package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */
public class Branching4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите А = ");
        int a = sc.nextInt();

        System.out.println("Введите B = ");
        int b = sc.nextInt();

        System.out.println("Введите размеры кирпича = ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(checking(a,b,x,y,z));
    }

    public static boolean checking(int a, int b, int x, int y, int z) {

        if ((a >= x && b >= y)||(a >= y && b >= x)) {
            System.out.println("Кирпич пройдет в отверстие");
            return true;
        }else if ((a >= x && b >= z)||(a >= z && b >= x)) {
            System.out.println("Кирпич пройдет в отверстие");
            return true;
        }else if ((a >= y && b >= z)||(a >= z && b >= y)) {
            System.out.println("Кирпич пройдет в отверстие");
            return true;
        }else {
            System.out.println("Кирпич не пройдет в отверстие");
            return false;
        }
    }
}
