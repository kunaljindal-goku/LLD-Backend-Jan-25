public class Student implements Prototype<Student>{

    private String name;
    private int psp;
    private int age;
    private String batchName;
    private String instructor;

    public Student(String batchName, String instructor){
        this.batchName = batchName;
        this.instructor = instructor;
    }

    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.instructor = other.instructor;
        this.psp = other.psp;
        this.batchName = other.batchName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
