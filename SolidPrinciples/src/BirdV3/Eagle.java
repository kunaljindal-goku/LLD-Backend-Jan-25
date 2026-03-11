package BirdV3;

public class Eagle extends Bird{

    HighFlyer highFlyer;
    public Eagle() {
        highFlyer = new HighFlyer();
    }

    @Override
    public void fly() {
        highFlyer.flyHigh();
    }
}
