package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Вычислить значение функции:
если x <=3 то  x(2)-3x+9 если x >3 то  1/(x(3)+6)
 */
public class Branching5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        System.out.println(checking(x));

    }

    public static double checking(double x) {
        double result = 0;
        if (x <= 3) {
            result =  (Math.pow(x, 2)) - 3 * x + 9;
        }else{
            result = 1/((Math.pow(x,3)) + 6);
        }
        return result;
    }
}
