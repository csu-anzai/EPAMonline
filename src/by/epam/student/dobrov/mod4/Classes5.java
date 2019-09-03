package by.epam.student.dobrov.mod4;

/*
Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 уменьшать свое значение на единицу в заданном диапазоне.
 Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 Написать код, демонстрирующий все возможности класса.
 */
public class Classes5 {
    public static void main(String args[]) throws Exception {

        Counter1 counter = new Counter1( );
        System.out.println(counter.getCount());

        counter.incrementCount();

        System.out.println(counter.getCount());
        counter.decrementCount();
        System.out.println(counter.getCount());


        Counter1 counter1 = new Counter1( 0,1,10);
        System.out.println(counter1.getCount());

        counter1.incrementCount();
        System.out.println(counter1.getCount());

        counter1.decrementCount();
        System.out.println(counter1.getCount());
    }
}

class Counter1 {
    private int count;
    private int maxCount;
    private int minCount;

    public Counter1() {

        this.count = 0;
        this.maxCount = 10;
        this.minCount = -10;
    }


    public Counter1(int count, int minCount,int maxCount) throws Exception {

        CheckParametrs(count, minCount,maxCount);
        this.count = count;
        this.maxCount = maxCount;
        this.minCount = minCount;

    }

    public int getCount() {
        return count;
    }

    public void CheckParametrs(int count, int minCount,int maxCount)throws Exception{
        if (maxCount < minCount) {
            throw new Exception("illegal values");
        }
        if (count < minCount) {
            throw new Exception("illegal values");
        }
        if (count > maxCount) {
            throw new Exception("illegal values");
        }

    }

    public void incrementCount() {
        count++;

        if (count > maxCount) {
            count = minCount;
        }
    }

    public void decrementCount() {
        count--;

        if (count < minCount) {
            count = maxCount;
        }
    }

    @Override
    public String toString() {
        return String.format("Counter1{" +
                "count=" + count +
                ", maxCount=" + maxCount +
                ", minCount=" + minCount +
                '}');
    }
}