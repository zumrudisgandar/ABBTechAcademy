package Lesson4.Lesson4Exercise;

public class CounterTest {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        System.out.println("Number of count instances: " + Counter.getInstanceCount());
    }
}
