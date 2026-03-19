public class Avenger implements Prototype<Avenger>{

    String name;
    int power;
    int age;

    public Avenger() {
    }

    public Avenger(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public Avenger(Avenger other) {
        this.name = other.name;
        this.age = other.age;
        this.power = other.power;
    }

    @Override
    public Avenger clone() {
        return new Avenger(this);
    }
}
