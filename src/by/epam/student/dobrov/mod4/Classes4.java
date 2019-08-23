package by.epam.student.dobrov.mod4;


import java.util.ArrayList;
import java.util.Scanner;

/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
*/
public class Classes4 {
    public static void main(String[] args) {

        Train train[] = new Train[5];
        train[0] = new Train("Grodno", 1, 7, 55);
        train[1] = new Train("Minsk", 7, 4, 54);
        train[2] = new Train("Gomel", 2, 5, 53);
        train[3] = new Train("Moscow", 4, 6, 52);
        train[4] = new Train("Grodno", 8, 7, 51);

        System.out.println("Начальный порядок номеров : ");
        showArrayByTrainNumber(train);

        System.out.println("Сортировка номеров :");
        Train sortArray[] = sortTrainNumber(train);
        showFullInfoByTrainNumber(sortArray);

        Scanner sc = new Scanner(System.in);


        System.out.println("Введите номер поезда:");
        int inputNumber = sc.nextInt();
        Train outputTrainNumberArray[] = outputByNumberOfTrain(inputNumber, train);
        showFullInfoByTrainNumber(outputTrainNumberArray);

        System.out.println("Сортировка по пункту назначения:");
        Train[] sortByPlace = sortByTargetPlace(train);
        showFullInfoByTrainNumber(sortByPlace);

    }

    public static Train[] sortTrainNumber(Train train[]) {
        Train temp;
        for (int i = 0; i < train.length; i++) {
            for (int j = i + 1; j < train.length; j++) {
                if (train[i].getTrainNumber() > train[j].getTrainNumber()) {
                    temp = train[i];
                    train[i] = train[j];
                    train[j] = temp;
                }
            }
        }
        return train;
    }

    public static Train[] outputByNumberOfTrain(int trainNumber, Train train[]) {
        ArrayList<Train> list = new ArrayList<>();
        for (int i = 0; i < train.length; i++) {
            if (train[i].checkTrainNumber(trainNumber)) {
                list.add(train[i]);

            }

        }
        Train list2[] = new Train[list.size()];
        return list.toArray(list2);
    }


    public static void showArrayByTrainNumber(Train train[]) {

        for (int i = 0; i < train.length; i++) {
            System.out.println(train[i].getTrainNumber());
        }

    }

    public static void showFullInfoByTrainNumber(Train train[]) {

        for (Train i : train) {
            System.out.println(i);
        }

    }

    public static Train[] sortByTargetPlace(Train train[]) {
        Train tempByTargetPlace;
        Train tempByHoursDelivery;
        Train tempByMinDelivery;
        for (int i = 0; i < train.length; i++) {
            for (int j = i + 1; j < train.length; j++) {
                if ((train[i].getTargetPlace().compareTo(train[j].getTargetPlace())) > 0) {
                    tempByTargetPlace = train[i];
                    train[i] = train[j];
                    train[j] = tempByTargetPlace;
                }
                if ((train[i].getTargetPlace().compareTo(train[j].getTargetPlace())) == 0) {
                    if (train[i].getHoursDelivery() > train[j].getHoursDelivery()) {
                        tempByHoursDelivery = train[i];
                        train[i] = train[j];
                        train[j] = tempByHoursDelivery;

                    } else if (train[i].getHoursDelivery() == train[j].getHoursDelivery()){
                        if (train[i].getMinDelivery() > train[j].getMinDelivery()){
                            tempByMinDelivery = train[i];
                            train[i] = train[j];
                            train[j] = tempByMinDelivery;
                        }
                    }
                }
            }
        }
        return train;
    }
}

class Train {
    private String targetPlace;
    private int trainNumber;
    private int hoursDelivery;
    private int minDelivery;


    public Train(String targetPlace, int trainNumber, int hoursDelivery, int minDelivery) {
        this.targetPlace = targetPlace;
        this.trainNumber = trainNumber;
        this.hoursDelivery = hoursDelivery;
        this.minDelivery = minDelivery;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTargetPlace() {
        return targetPlace;
    }

    public int getHoursDelivery() {
        return hoursDelivery;
    }

    public int getMinDelivery() {
        return minDelivery;
    }

    public boolean checkTrainNumber(int trainNumber) {
        if (trainNumber == this.trainNumber) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Train{" +
                "targetPlace='" + targetPlace + '\'' +
                ", trainNumber=" + trainNumber +
                ", hoursDelivery=" + hoursDelivery +
                ", minDelivery=" + minDelivery +
                '}');
    }
}


