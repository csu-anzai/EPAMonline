package by.epam.student.dobrov.mod1;

/*
6. Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */

public class LinearTask6 {
    public static void main(String[] args) {

        double x = (Math.random() * (5 - (-5)) + (-5));
        double y = (Math.random() * (5 - (-5)) + (-5));

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(dot(x, y));
    }

    public static boolean dot(double x, double y) {

        if (x >= 0 && x <= 2 && y >= 0 && y <= 4) {
            return true;
        }
        if (x <= 0 && x >= -2 && y >= 0 && y <= 4) {
            return true;
        }
        if (x <= 0 && x >= -4 && y <= 0 && y >= -3) {
            return true;
        }
        if (x >= 0 && x <= 4 && y <= 0 && y >= -3) {
            return true;
        }
        return false;
    }
}
//Задача сделана для 4-ех квадрантов  т.е.  (x,y;  -x,y; -x,-y; x,-y)
