package BirdV3;

public class Vulture extends Bird{

    HighFlyer highFlyer;
    public Vulture() {
        highFlyer = new HighFlyer();
    }

    @Override
    public void fly() {
        highFlyer.flyHigh();
    }
}
