package ThisKeyword;

public class Student {

    int age;

    int gradYear;

    Exam exam;

    public Student() {

    }

    // this -> refers to the current object
    public Student(int age, int gradYear, Exam exam) {
        this.age = age;
        this.gradYear = gradYear;
        this.exam = exam;
    }

    // copy constructor
    public Student(Student other) {
        this.age = other.age;
        this.gradYear = other.gradYear;
        this.exam = new Exam(other.exam);
    }
}
