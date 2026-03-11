package BirdV3;

public class Sparrow extends Bird{

    LowFlyer lowFlyer;
    public Sparrow() {
        lowFlyer = new LowFlyer();
    }

    @Override
    public void fly() {
        lowFlyer.flyLow();
    }
}
