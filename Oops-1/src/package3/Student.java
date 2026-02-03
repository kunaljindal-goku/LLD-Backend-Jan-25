package package3;

public class Student {

    int studentId;
    String name;
    int age;
    String universityName;

    public Student() {

    }

    public Student(int id, String n, int a, String univ) {
        studentId = id;
        name = n;
        age = a;
        universityName = univ;
    }


    public void attendClass() {
        System.out.println(name + " is attending class");
    }

    public void solveAssignment(String assignment) {
        System.out.println(name + " is solving "+assignment);
    }
}
