package by.epam.student.dobrov.mod4;
/*
Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.
 */
import java.util.Scanner;

public class Classes2 {
    public static void main(String[] args) {

        Test2 test = new Test2(1,3);
        System.out.println(test.getNumber1());
        System.out.println(test.getNumber2());

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        test.setNumber1(number1);
        test.setNumber2(number2);
    }

}
class Test2 {
    private int number1;
    private int number2;

    public Test2(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Test2() {
        this.number1 = 0;
        this.number2 = 0;
    }

    public int getNumber1(){
       return number1;
    }

    public int getNumber2(){
        return number2;
    }

    public void setNumber1(int number1){
        this.number1 = number1;
    }

    public void setNumber2(int number2){
        this.number2 = number2;
    }

}
