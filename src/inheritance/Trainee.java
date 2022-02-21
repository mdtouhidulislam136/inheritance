package inheritance;

public class Trainee extends Student {
    String employer;
    float salary;

    Trainee(String employer, float salary , String name, int age, int studentId){
        super(name, age , studentId);
        this.employer = employer;
        this.salary = salary;
    }



    @Override
    void printStudentDate(){
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student Id: " + studentId);
        System.out.println("student employee as : " + employer);
        System.out.println("Student salary: " + salary + " Euro");

    }
}

