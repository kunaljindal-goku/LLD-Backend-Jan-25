package polymorphism;

import Inheritance2.A;
import Inheritance2.C;

import java.nio.channels.CancelledKeyException;

public class Client {

    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.walk();
//
//        Dog d = new Dog();
//        d.bark();
//        d.walk();

//        Animal a = new Dog();
//
//        Calculator c = new Calculator();
//        c.add(3,"4");

        User u = new User();
        u.login();
        System.out.println(u.age);

        Student s = new Student();
        s.login();
        System.out.println(s.age);

        User u1 = new Student();
        u1.login(); // object
//        System.out.println(u1.age);
    }
}
