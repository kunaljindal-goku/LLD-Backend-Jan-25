package BirdV2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void makeAllBirdsFly(List<Flyable> birds) {
        for(int i=0;i<birds.size();i++) {
            birds.get(i).fly();
        }
    }

    public static void main(String[] args) {

//        BirdV0.Bird b1 = new BirdV0.Bird();
//        b1.setAge(10);
//        b1.setName("b1");
//        b1.setType("Peacock");
//
//        b1.eat();
//
//        b1.makeSound();
//
//        BirdV0.Bird b2 = new Bird();
//        b2.setAge(10);
//        b2.setName("b1");
//        b2.setType("Crow");
//
//        b2.eat();
//
//        b2.makeSound();

        List<Bird> birds = new ArrayList<>();
        birds.add(new Crow());
        birds.add(new Sparrow());
        birds.add(new Penguin());

      //  makeAllBirdsFly(birds);

    }
}