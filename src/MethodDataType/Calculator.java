package MethodDataType;

public class Calculator {
    public int Sum(int a, int b){
        return a+b;
    }
    public int Multiplication(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int a = 2;
        int b = 5;
        System.out.println("a + b = "+calculator.Sum(a,b));
        System.out.println(("a * b ="+calculator.Multiplication(a,b)));
    }
}
