public class Thor extends Avenger{
    int hammer;

    public Thor(String name, int age, int power, int hammer) {
        super(name,power,age);
        this.hammer = hammer;
    }

    public Thor(Thor other) {
        this.name = other.name;
        this.age = other.age;
        this.power = other.power;
        this.hammer = other.hammer;
    }

    public Thor clone() {
        return new Thor(this);
    }
}
