
public class IronMan extends Avenger{
    String jarvis;

    public IronMan(String name, int age, int power, String jarvis) {
        super(name,power,age);
        this.jarvis = jarvis;
    }

    public IronMan(IronMan other) {
        this.name = other.name;
        this.age = other.age;
        this.power = other.power;
      // super(other.name,other.power,other.age);
        this.jarvis = other.jarvis;
    }

    @Override
    public IronMan clone() {
        return new IronMan(this);
    }
}
