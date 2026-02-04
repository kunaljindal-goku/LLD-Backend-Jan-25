package ThisKeyword;

import java.net.DatagramSocket;

public class Client {

    public static void fun(Student s) {
        s.age += 10;
    }

    public static void main(String[] args) {
        Exam exam = new Exam(1,"LLD");
        Student s1 = new Student(30,2018,exam);

//        Student s2 = new Student(s1);
//
//        System.out.println("DEBUG");
//        s2.age = s1.age;
//        s2.gradYear = s1.gradYear;

        fun(s1);
        s1.age += 20;
        System.out.println(s1.age);
    }
}
