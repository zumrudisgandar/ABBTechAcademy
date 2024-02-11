package Lesson5Exercise;

// Task 2
public class Outer {
    private static class Inner {
        private static int count = 0;

        Inner() {
            count++;
        }
        static int getCount() {
            return count;
        }
    }

    public static void main (String[] args) {
        Inner innerClass1 = new Inner();
        Inner innerClass2 = new Inner();
        Inner innerClass3 = new Inner();
        Inner innerClass4 = new Inner();
        Inner innerClass5 = new Inner();

        System.out.println("Number of instances of Inner class: " + Inner.getCount());
    }
}

