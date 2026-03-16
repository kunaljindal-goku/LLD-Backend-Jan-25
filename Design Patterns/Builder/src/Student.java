public class Student {

    private int id;

    private String name;

    private int age;

    private String university;

    private int gradYear;

    private long phoneNumber;

    private double psp;

    private Student(Builder builder) {

        this.name = builder.getName();
        // set more values
        if(builder.getPsp() <= 0) {
            this.psp = builder.getPsp();
        }

    }

    public static Builder getHelper() {
        return new Builder();
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

    static class Builder {

        private int id;

        private String name;

        private int age;

        private String university;

        private int gradYear;

        private long phoneNumber;

        private double psp;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            if(this.getAge()==0) {
                throw new IllegalArgumentException("Invalid age");
            }
            if(this.getName()==null) {
                throw new IllegalArgumentException("Invalid age");
            }
            // validations
            return new Student(this);
        }
    }
}
