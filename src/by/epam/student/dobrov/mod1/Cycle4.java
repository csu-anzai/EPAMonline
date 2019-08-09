package by.epam.student.dobrov.mod1;


/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

import java.math.BigInteger;

public class Cycle4 {
    public static void main(String[] args) {

        BigInteger num = BigInteger.ONE;

        BigInteger length = BigInteger.valueOf(200);

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= 200; i++) {

            num = num.add(BigInteger.valueOf(1));

            result = result.multiply(num.pow(2));
            System.out.println(i + " : " + result);
        }




    }
}
