package package3;

public class Client {

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("DEBUG");

        Student s2 = new Student(1, "Kohli",37,"ICT");

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
