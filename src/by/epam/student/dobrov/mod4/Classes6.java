package by.epam.student.dobrov.mod4;

/*
Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Classes6 {
    public static void main(String args[]) {

        ShowTime showTime = new ShowTime(5, 10, 15);
        System.out.printf("%d:%02d:%02d", showTime.getHour(), showTime.getMin(), showTime.getSec());

        System.out.println();

        showTime.setHour(1);
        showTime.setMin(2);
        showTime.setSec(3);
        System.out.printf("%d:%02d:%02d", showTime.getHour(), showTime.getMin(), showTime.getSec());

        System.out.println();

        showTime.setMin(5);
        System.out.printf("%d:%02d:%02d", showTime.getHour(), showTime.getMin(), showTime.getSec());

        System.out.println();

        showTime.setHour(1);
        showTime.setMin(2);
        showTime.setSec(3);
        System.out.printf("%d:%02d:%02d", showTime.changeHour(1), showTime.changeMin(2), showTime.changeSec(3));
    }

}

class ShowTime {

    private int hour;
    private int min;
    private int sec;


    //конструктор
    public ShowTime(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;

    }

    // геттеры и сеттеры
    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (this.hour > 24 || this.hour < 0) {
            this.hour = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
        if (this.min > 60 || this.min < 0) {
            this.min = 0;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
        if (this.sec > 60 || this.sec < 0) {
            this.sec = 0;
        }

    }


    public int changeHour(int newHour) {
        this.hour += newHour;
        if (this.hour > 24 || this.hour < 0) {
            this.hour = 0;
        }
        return this.hour;
    }

    public int changeMin(int newMin) {
        this.min += newMin;
        if (this.min > 60 || this.min < 0) {
            this.min = 0;
        }
        return this.min;
    }

    public int changeSec(int newSec) {
        this.sec += newSec;
        if (this.sec > 60 || this.sec < 0) {
            this.sec = 0;
        }
        return this.sec;
    }


    @Override
    public String toString() {
        return String.format("ShowTime{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                '}');
    }
}
