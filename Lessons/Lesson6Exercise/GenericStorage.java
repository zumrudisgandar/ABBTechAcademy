package Lesson6Exercise;

public class GenericStorage <T> {

    private Object[] people;
    private int count;

    public GenericStorage() {
        people = new Object[500];
        count = 0;
    }

    // add operation
    public void addItem(T person) {

        people[count++] = person;
    }
    // remove operation
    public void removeItem(T person) {
        System.out.println("Item Removed");
        System.out.println();
        int indexOfItem = -1;
        for(int i = 0;  i < count; i++) {
            if(people[i].equals(person)) {
                indexOfItem = i;
                break;
            }
        }

        if (indexOfItem != -1) {
            for(int i = indexOfItem; i < count - 1; i++) {
                people[i] = people[i + 1];
            }
            count--;
        }
    }
    // search operations
    public Student searchStudentById(int id) {
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Student && ((Student) people[i]).getId() == id) {
                return (Student) people[i];
            }
        }
        return null;
    }

    public Teacher searchTeacherById(int id) {
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Teacher && ((Teacher) people[i]).getId() == id) {
                return (Teacher) people[i];
            }
        }
        return null;
    }

    public Student searchStudentByName(String name) {
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Student && ((Student) people[i]).getName() == name) {
                return (Student) people[i];
            }
        }
        return null;
    }

    public Teacher searchTeacherByName(String name) {
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Teacher && ((Teacher) people[i]).getName() == name) {
                return (Teacher) people[i];
            }
        }
        return null;
    }

    // display operation
    public void displayAllItems() {
        System.out.println("There are " + count + " elements in the People array.");
        boolean flagStudent = true;
        boolean flagTeacher = true;

        for(int i = 0; i < count; i++) {
            if (people[i] instanceof Student) {
                Student student = (Student) people[i];
                if (flagStudent) {
                    System.out.println("Student details:");
                    flagStudent = false;
                }
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
            } else if (people[i] instanceof Teacher) {
                Teacher teacher = (Teacher) people[i];
                if(flagTeacher) {
                    System.out.println("Teacher details:");
                    flagTeacher = false;
                }
                System.out.println("ID: " + teacher.getId() + ", Name: " + teacher.getName() + ", Age: " + teacher.getAge());
            }
        }
        System.out.println();
    }
}
