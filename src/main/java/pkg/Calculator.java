package pkg;

public class Calculator {
    public int add(int i, int j) {
        int result = 0;
        result = i+j;
        System.out.println("test");
        return result;
    }
    public int subtract(int i, int j) {
        return i-j;
    }
    public int multiply(int i, int j) {
        return i*j;
    }
    public int divide(int i, int j) {
        return i/j;
    }
    //comment again
}

class NonPublicClass {}

