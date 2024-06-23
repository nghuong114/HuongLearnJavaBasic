package LoopFor;

public class LoopFor {
    public static void main(String[] args) {
        int[] array1= new int[26];
        int j=0;
        for(int i =0; i<=50; i++){
            if(i%2==0){
                array1[j]=i;
                j++;
            }
        }
        for(int i=0;i<26;i++){
            System.out.println(array1[i]);
        }

    }
}
