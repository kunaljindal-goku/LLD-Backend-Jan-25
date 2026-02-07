package polymorphism;

public class Calculator {

    int add(int a, int b) {
        return a+b;
    }

    int add(int a, String b) {
        return a+Integer.parseInt(b);
    }
}
