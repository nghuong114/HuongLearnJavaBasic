package Operator_IfElse;

public class Condition {
    public static int number = 100;
    public void Compare(int n){
        if(n==number){
            System.out.println(n+" = "+number);
        }else
            if(n<number){
                System.out.println(n+" < "+ number);

            } else{
                System.out.println(n+ " > "+number);
            }
    }

    public static void main(String[] args) {
        int n = 200;
        Condition condition = new Condition();
        condition.Compare(n);
    }
}
