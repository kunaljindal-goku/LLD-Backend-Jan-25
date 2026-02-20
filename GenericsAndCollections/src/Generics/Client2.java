package Generics;

public class Client2 {

    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator();
        c1.add(3,4);

        Calculator<Double> c2 = new Calculator<>();
        c2.add(3.4,5.5);

        Calculator<String> c3 = new Calculator<>();

        System.out.println(c3.add("3","4"));
    }
}
