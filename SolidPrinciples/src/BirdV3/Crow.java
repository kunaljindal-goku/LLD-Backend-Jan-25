package BirdV3;

public class Crow extends Bird{

    Flyer flyer;
    public Crow(Flyer flyer) {
        this.flyer = flyer;
    }

    @Override
    public void fly() {
       flyer.fly();
    }
}
