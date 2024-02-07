package Lesson4.Lesson4Exercise;

public class Counter {
    static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    public Counter() {
        instanceCount++;
    }
}
