package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(b +  √(𝑏(2) + 4𝑎с)) /2a  -  𝑎(3)c  + 𝑏(-2)
 */


public class LinearTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(example(a, b, c));
    }

    public static double example(double a, double b, double c) {

        double step1 = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c));
        double step2 = step1 % 2 * a;
        double step3 = ((Math.pow(a, 3) * c) + Math.pow(b, -2));

        double result = step2 - step3;

        return result;


    }
}
