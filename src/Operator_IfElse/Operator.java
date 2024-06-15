package Operator_IfElse;

public class Operator {
    public static int a = 10;
    public static int b = 20;
    public static int c= 50;

    public static void main(String[] args) {
       //Toan tu quan he
        System.out.println(a==b); //So sanh bang
        System.out.println(a!=b); //So sanh khac
        System.out.println(a>b); //So sanh lon hon
        System.out.println(a<b); //So sanh nho hon
        System.out.println(a>=b); // So sanh lon hon hoac bang
        System.out.println(a<=b); // So sanh nho hon hoac bang
        //Toan tu logic
        System.out.println((a<b) && (b<c)); //And hai dieu kien
        System.out.println((a>b) || (b<c)); // Hoac 1 trong 2 dieu kien
        System.out.println((a<b)^(b<c)); //XOR chi 1 trong 2 dieu kien dung
        System.out.println(!(a<b)); // NOT tra ve FALSE neu a<b laf TRUE
    }
}
