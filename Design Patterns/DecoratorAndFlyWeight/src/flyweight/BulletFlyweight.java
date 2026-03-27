package flyweight;

public class BulletFlyweight {


    //intrinsic attributes - common attributes
    String color;
    int radius;
    String material;

    public BulletFlyweight(String material, int radius, String color) {
        this.material = material;
        this.radius = radius;
        this.color = color;
    }
}
