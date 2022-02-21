package inheritance;

public class Student {
    String name;
    int age;
    int studentId;

    Student(String name, int age, int studentId){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    void printStudentDate(){
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student Id: " + studentId);

    }
}

