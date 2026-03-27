package flyweight;

public class Bullet {

    BulletFlyweight bulletFlyweight;
    // extrinsic - Changing attributes
    double x;
    double y;

    public Bullet(BulletFlyweight bulletFlyweight, double x, double y) {
        this.bulletFlyweight = bulletFlyweight;
        this.x = x;
        this.y = y;
    }
}
