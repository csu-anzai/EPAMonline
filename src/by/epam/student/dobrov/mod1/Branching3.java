package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Branching3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int x3 = sc.nextInt();
            int y3 = sc.nextInt();

            if ((x2 - x1) / (x3 - x1) == ((y2 - y1) / (y3 - y1))) {
                System.out.println("Точки расположены на одной линии");
            } else {
                System.out.println("Не на одной прямой ");
            }
        }catch (Exception e){
            System.out.println("Че то не так!");
        }
    }
}
