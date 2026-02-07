package Inheritance2;

public class Student{

    int age;
    String name;
    int psp;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(int age, String name) {
        this(age);
        this.name = name;
    }

    public Student(int age, String name, int psp) {
//        this.age = age;
//        this.name = name;
        this(age,name);
        this.psp = psp;

    }
}
