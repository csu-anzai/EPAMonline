package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class LinearTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numFull = sc.nextDouble();
        int numBeforeDot = (int) numFull;

        double numAfterDot = 0;
        numAfterDot =  numFull - numBeforeDot;


        System.out.println(convert2(numAfterDot) + convert1(numBeforeDot));
    }


    public static double convert1(double a) {
        return a / 1000;
    }

    public static double convert2(double a) {
        return Math.round(a * 1000);

    }
}
