package Generics;

public class Calculator<A> {

    public <A extends Number> int add(A a, A b) {
        return a.intValue()+b.intValue();
    }

//    public A add(A a, A b) {
//        return a+b;
//    }
}
