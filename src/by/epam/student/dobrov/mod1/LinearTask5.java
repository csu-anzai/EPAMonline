package by.epam.student.dobrov.mod1;

import java.util.Scanner;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class LinearTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tSec = sc.nextInt();

        time(tSec);
    }

    public static int time (int a ){

        int hours = a / 60 / 60;
        int minutes = a / 60 % 60;
        int seconds = a % 60;

        //структура вывода времени на экран в формате чч:мм:сс
        System.out.printf("%dч %02dмин %02dсек", hours, minutes, seconds);

        return a;
    }

}
