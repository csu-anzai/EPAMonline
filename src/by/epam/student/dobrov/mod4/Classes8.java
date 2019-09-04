package by.epam.student.dobrov.mod4;

import java.util.Arrays;

/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данныхи вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Classes8 {
    public static void main(String args[]) {

        Customer[] customers = new Customer[3];
        customers[0] = new Customer(111, "Qwert7", "Qwert1", "Qwert1", "Qwe1", 1111, 1111);
        customers[1] = new Customer(222, "Qwert1", "Qwert2", "Qwert2", "Qwe2", 2222, 2222);
        customers[2] = new Customer(333, "Qwert3", "Qwert3", "Qwert3", "Qwe3", 3333, 3333);


        DataCustomers dataCustomers = new DataCustomers(customers);
        dataCustomers.sortBySurname();
        dataCustomers.showCustomerBySurname();

        System.out.println();

        dataCustomers.dataCustomersByCreditCard(1000, 2500);
    }


}


class Customer {
    private int id;
    private String surname;
    private String name;
    private String fatherName;
    private String address;
    private int numberOfCreditCard;
    private int numberOfBankAcc;

    public Customer(int id, String surname, String name, String fatherName, String address, int numberOfCreditCard, int numberOfBankAcc) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.numberOfBankAcc = numberOfBankAcc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public int getNumberOfBankAcc() {
        return numberOfBankAcc;
    }

    public void setNumberOfBankAcc(int numberOfBankAcc) {
        this.numberOfBankAcc = numberOfBankAcc;
    }

    @Override
    public String toString() {
        return String.format("Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                ", numberOfBankAcc=" + numberOfBankAcc +
                '}');
    }

    public boolean checkSurname(String surname) {
        if (surname == this.surname) {
            return true;
        }
        return false;
    }
}

class DataCustomers {
    private static Customer[] customers;
//    private Customer[] customers;


    public DataCustomers(Customer... customers) {
        this.customers = customers;

    }

    public Customer[] getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return String.format("DataCustomers{" +
                "customers=" + Arrays.toString(customers) +
                '}');
    }

    //список покупателей в алфавитном порядке;
    public  static Customer[] sortBySurname() {

        Customer temp;

        for (int i = customers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (customers[j].getSurname().compareTo(customers[j + 1].getSurname()) > 0) {
                    temp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = temp;
                }
            }

        }
        return customers;

    }

    //список покупателей, у которых номер кредитной карточки находится в заданном интервале
    public Customer[] dataCustomersByCreditCard(int a, int b) {

        for (int i = 0; i < this.customers.length; i++) {
            if (customers[i].getNumberOfCreditCard() >= a && customers[i].getNumberOfCreditCard() <= b) {
                System.out.println(customers[i] + " ");
            }
        }

        return customers;
    }


    //вывод на консоль
    public  static void showCustomerBySurname() {

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }

    }


}



