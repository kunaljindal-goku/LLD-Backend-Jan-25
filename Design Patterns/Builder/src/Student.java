public class Student {

    private int id;

    private String name;

    private int age;

    private String university;

    private int gradYear;

    private long phoneNumber;

    private double psp;

    public Student(Helper helper) {
        if(helper.getAge()==0) {
            throw new IllegalArgumentException("Invalid age");
        }
        if(helper.getName()==null) {
            throw new IllegalArgumentException("Invalid age");
        }
        // validations
        this.name = helper.getName();
        // set more values
        if(helper.getPsp() <= 0) {
            this.psp = helper.getPsp();
        }

    }

    public static Helper getHelper() {
        return new Helper();
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
