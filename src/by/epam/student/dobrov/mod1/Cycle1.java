package by.epam.student.dobrov.mod1;
import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Cycle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число = ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i < num; i ++){

            sum +=i;
        }
        System.out.println(sum);
    }
}

