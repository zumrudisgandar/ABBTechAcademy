package Lesson4.Lesson4Exercise;

enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public boolean isWeekend() {
        if (this == SATURDAY || this == SUNDAY) {
            return true;
        }
        return false;
    }
}
public class DayOfWeekTest {

    public static void main (String [] args) {
    DayOfWeek saturday = DayOfWeek.SATURDAY;
    DayOfWeek friday = DayOfWeek.FRIDAY;
    DayOfWeek sunday = DayOfWeek.SUNDAY;
    DayOfWeek wednesday = DayOfWeek.WEDNESDAY;

    System.out.println("Saturday: " + saturday);
    System.out.println("Friday: " + friday);
    System.out.println("Sunday: " + sunday);
    System.out.println("Wednesday: " + wednesday);

    System.out.println("Is Saturday a weekend? " + saturday.isWeekend());
    System.out.println("Is Friday a weekend? " + friday.isWeekend());
    System.out.println("Is Sunday a weekend? " + sunday.isWeekend());
    System.out.println("Is Wednesday a weekend? " + wednesday.isWeekend());




    }

}
