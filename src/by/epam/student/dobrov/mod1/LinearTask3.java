package by.epam.student.dobrov.mod1;

import java.util.Scanner;


/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 y) / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)  * tg xy
 */
public class LinearTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println(example(x,y));
    }

    public static double example(double x, double y) {

        double step1 = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));

        return step1 * Math.tan(x * y);
    }
}
