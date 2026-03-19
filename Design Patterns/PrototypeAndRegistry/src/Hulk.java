public class Hulk extends Avenger{

    int angerLevel;

    public Hulk(String name, int age, int power, int angerLevel) {
        super(name,power,age);
        this.angerLevel = angerLevel;
    }

    public Hulk(Hulk other) {
        this.name = other.name;
        this.age = other.age;
        this.power = other.power;
        this.angerLevel = other.angerLevel;
    }

    public Hulk clone() {
        return new Hulk(this);
    }
}
