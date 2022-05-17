package org.example;

public class App {
    
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int result = 0;

        Multiply m = new Multiply();
        result = m.multiply(a, b);

        System.out.println(result);

    }
    
}
