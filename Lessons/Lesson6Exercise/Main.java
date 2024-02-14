package Lesson6Exercise;

public class Main {
    public static void main(String[] args) {
    GenericStorage<Object> genericStorage = new GenericStorage<>();

    Student student1 = new Student("Alice", 20);
    Student student2 = new Student("Henry", 23);
    Student student3 = new Student("Alex", 24);
    Student student4 = new Student("Jane", 19);
    Student student5 = new Student("Cedric", 22);

    Teacher teacher1 = new Teacher("Prof. Martin", 36);
    Teacher teacher2 = new Teacher("Prof. Marie", 40);
    Teacher teacher3 = new Teacher("Prof. Jack", 32);
    Teacher teacher4 = new Teacher("Prof. George", 42);
    Teacher teacher5 = new Teacher("Prof. Ada", 34);


    // add items
    genericStorage.addItem(student1);
    genericStorage.addItem(student2);
    genericStorage.addItem(student3);
    genericStorage.addItem(student4);
    genericStorage.addItem(student5);

    genericStorage.addItem(teacher1);
    genericStorage.addItem(teacher2);
    genericStorage.addItem(teacher3);
    genericStorage.addItem(teacher4);
    genericStorage.addItem(teacher5);

    // retrieve items
    genericStorage.displayAllItems();

    // remove items
    genericStorage.removeItem(student3);
    genericStorage.removeItem(teacher1);

    // display items after removing
    System.out.println("Items after remove operation:");
    genericStorage.displayAllItems();

    // search operations
    System.out.println("Search operation by ID:");
    int searchIdStudent = 3;

    Student searchStudentById = genericStorage.searchStudentById(searchIdStudent);
    if (searchStudentById != null) {
        System.out.println("Searched Student: " + searchStudentById.getName());
    } else {
        System.out.println("Student with id " + searchIdStudent +  " does not exist.");
    }

    int searchIdTeacher = 4;
    Teacher searchTeacherById = genericStorage.searchTeacherById(searchIdTeacher);
    if (searchTeacherById != null) {
        System.out.println("Searched Teacher: " + searchTeacherById.getName());
    } else {
        System.out.println("Teacher with id " + searchIdTeacher +  " does not exist.");
    }

    System.out.println("Search operation by Name:");
    String searchNameStudent = "Cedric";
    Student searchStudentByName = genericStorage.searchStudentByName(searchNameStudent);
    if (searchStudentByName != null) {
        System.out.println("Searched Student: " + searchStudentByName.getName());
    } else {
        System.out.println("Student with name - " + searchNameStudent + " - does not exist.");
    }

    String searchNameTeacher = "Prof. Mariam";
    Teacher searchTeacherByName = genericStorage.searchTeacherByName(searchNameTeacher);
    if (searchTeacherByName != null) {
        System.out.println("Searched Teacher: " + searchTeacherByName.getName());
    } else {
        System.out.println("Teacher with name - " + searchNameTeacher + " - does not exist.");
    }
    }
}
