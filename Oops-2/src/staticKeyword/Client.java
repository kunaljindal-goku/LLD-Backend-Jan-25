package staticKeyword;

public class Client {

    public void sayHello1() {
        Student s = new Student(34,23);
        Student.sayHello();
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Student s1 = new Student(20,80);
        Student s2 = new Student(23,40);

        System.out.println(Student.count);
        Student.sayHello();
        System.out.println("DEBUG");
    }
}
