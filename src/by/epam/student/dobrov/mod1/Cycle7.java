package by.epam.student.dobrov.mod1;



import java.util.Scanner;

/*
 Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры
 */
public class Cycle7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        var1(m, n);
        System.out.println();


    }

    public static void var1(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");

            for (int div = 1; div < n; div++) {

                if (i % div == 0 && div != 1 && div != i) {
                    System.out.print(div + " ");

                }
            }
            System.out.println();
        }
    }
}


