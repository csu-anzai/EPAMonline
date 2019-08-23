package by.epam.student.dobrov.mod4;

import java.util.Scanner;
/*
Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных,
и метод, который находит наибольшее значение из этих двух переменных.
 */

public class Classes1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Test1 test = new Test1(1,3);
        System.out.println(test.getNumber1());
        System.out.println(test.getNumber2());
        System.out.println(test);

        System.out.println();

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        test.setNumber1(number1);
        test.setNumber2(number2);

        System.out.println();

        System.out.println(test.sumNum());
        System.out.println(test.maxNum());
    }

}
class Test1 {

    private int number1;
    private int number2;

    public Test1(int number1,int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;

    }

    public int getNumber2() {
        return number2;

    }

    @Override
    public String toString() {

        return String.format("num1:%d, num2:%d",number1,number2);
    }


    public void setNumber1(int num) {
        this.number1 = num;

    }

    public void setNumber2(int num) {
        this.number2 = num;

    }

    public int sumNum() {
        int sum = number1 + number2;
        return sum;
    }

    public int maxNum() {
        int max = number1;

        if (number2 > max) {
            max = number2;
        }
        return max;
    }


}
