package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Bullet> typeABulets = new ArrayList<>();

        BulletFlyweight bulletFlyweightTypeA = new BulletFlyweight("Black", 5, "iron");

        for (int i = 0; i < 10; i++) {
            Bullet typeA = new Bullet(bulletFlyweightTypeA, Math.random(), Math.random());
            typeABulets.add(typeA);
        }

//        List<Bullet> typeBBulets = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            Bullet typeB = new Bullet("Blue", 6, "titanium", Math.random(), Math.random());
//            typeBBulets.add(typeB);
//        }
    }
}
