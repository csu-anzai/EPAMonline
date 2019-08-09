package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Даны два угла треугольника (в градусах).
Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.


 */
public class Branching1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double angle1 = sc.nextDouble();
        double angle2 = sc.nextDouble();

        double result = 180.0;
        double angle3 = Math.abs(result - (angle1 + angle2));

        System.out.println(angle3);
        System.out.println();

        System.out.println(triangle(angle1, angle2, angle3, result));
        System.out.println();
        System.out.println(rightTriangle(angle1, angle2, angle3, result));
    }

    public static boolean triangle(double angle1, double angle2, double angle3, double result) {
        if ((angle1 + angle2 + angle3) == result) {
            System.out.println("Треугольник верный");
            return true;
        }
        return false;
    }

    public static boolean rightTriangle(double angle1, double angle2, double angle3, double result) {
        if (angle1 == 90 && (angle1 + angle2 + angle3) == result) {
            System.out.println("Треугольник прямоугольный ");
            return true;
        }
        if (angle2 == 90 && (angle1 + angle2 + angle3) == result) {
            System.out.println("Треугольник прямоугольный ");
            return true;
        }
        if (angle3 == 90 && (angle1 + angle2 + angle3) == result) {
            System.out.println("Треугольник прямоугольный ");
            return true;
        }
        return false;
    }

}
