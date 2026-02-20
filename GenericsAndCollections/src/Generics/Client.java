package Generics;

import java.util.List;

public class Client {

    public static void main(String[] args) {
//         Pair p1 = new Pair();
//         p1.first = 3;
//         p1.second = 4;
//         p1.first = "ASBC";
//
//
//
//         Pair p2  = new Pair();
//         p2.first = "ABC";
//         p2.second = 98;
//
//         p2.first = 30;
//
//         String name = (String)p2.first;

   //      GenericPair<Integer, Integer> p = new GenericPair<>();
//         p.first = "ABC";

         // T,V -> Object
         // Raw type -> Object
         // support backward compatibility
      //   GenericPair p1 = new GenericPair();

//         User<Integer> u = new User<>();
//         u.first = 10;
//
//         u.doSomething(10);

         User<Integer> user = new User<>();
         user.fun(10);
         user.fun("KUnal");

         System.out.println(User.<String>doSomethingStatic("Kunal"));

    }
}
