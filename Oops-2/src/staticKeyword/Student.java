package staticKeyword;

public class Student {

    int psp;
    int age;
    static int count;

    public Student(int age, int psp) {
        this.age = age;
        this.psp = psp;
        count++;
    }

    public static void sayHello() {
        System.out.println("Hello from student class");
    }
}
