package Generics;

import java.util.SortedMap;

public class User<T> {

    T first;

    public void doSomething(T first) {
        System.out.println(first);
    }

    public static <E> int doSomethingStatic(E val) {
        return 10;
    }

    public  <V> void fun(V val) {
        System.out.println(val);
    }

    public  void fun1(T val) {
        System.out.println(val);
    }
}
