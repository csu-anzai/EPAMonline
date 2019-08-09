package by.epam.student.dobrov.mod1;

import java.util.Scanner;
/*
Найти max{min(a, b), min(c, d)}.
 */

public class Branching2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(searchMax(a,b,c,d));

    }

    public static int searchMax (int a,int b,int c, int d){

        int max =  Math.max(Math.min(a,b),Math.min(c,d));
        return max;
    }

}
