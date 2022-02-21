package inheritance;

public class  main {
    public static void main(String[] args) {

        Student student = new Student("Marko", 27, 34323);

        Trainee trainee = new Trainee("bugeti", 234333, "Taru", 23, 32244);

        student.printStudentDate();

        trainee.printStudentDate();
    }


}
