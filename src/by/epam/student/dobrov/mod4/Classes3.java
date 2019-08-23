package by.epam.student.dobrov.mod4;

/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Classes3 {
    public static void main(String[] args) {

        Student students[] = new Student[10];
        students[0] = new Student("st1", "stn1", "Blabla1", new int[]{1, 2, 3, 4, 5});
        students[1] = new Student("st2", "stn2", "Blabla2", new int[]{1, 2, 3, 4, 5});
        students[2] = new Student("st3", "stn3", "Blabla3", new int[]{9, 9, 9, 10, 9});
        students[3] = new Student("st4", "stn4", "Blabla4", new int[]{1, 2, 3, 4, 5});
        students[4] = new Student("st5", "stn5", "Blabla5", new int[]{1, 2, 3, 4, 5});
        students[5] = new Student("st6", "stn6", "Blabla6", new int[]{1, 2, 3, 4, 10});
        students[6] = new Student("st7", "stn7", "Blabla7", new int[]{1, 2, 3, 4, 5});
        students[7] = new Student("st8", "stn8", "Blabla8", new int[]{1, 2, 3, 4, 5});
        students[8] = new Student("st9", "stn9", "Blabla1", new int[]{1, 2, 3, 4, 5});
        students[9] = new Student("st10", "stn10", "Blabla10", new int[]{1, 2, 3, 4, 5});


        outputArray(students);
    }
    public static  void outputArray(Student students []) {
        for (Student i : students){
            if (i.checkExcellent()){
                System.out.println(i + " ");
            }
        }
    }
}


class Student {

    private String surname;
    private String name;
    private String numberOfGroup;
    private int progress [];

    public Student(String surname, String name, String numberOfGroup, int[] progress) {
        this.surname = surname;
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.progress  = new int[5];
        this.progress  = progress;
    }

    @Override

    public String toString() {
        return String.format("surname: %s, group: %s", surname,numberOfGroup );
    }

    public boolean checkExcellent() {
        for (int i = 0; i < progress.length; i++) {
            if (progress[i] < 9) {
                return false;
            }
        }
        return true;
    }
}
