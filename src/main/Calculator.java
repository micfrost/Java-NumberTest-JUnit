package main;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    int multiply(int a, int b)  {
        return a*b;
    }
    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        }
        return a / b;
    }
}