package LearnCollections;


import java.util.ArrayList;
import java.util.List;

public class JavaBasic4WithArrayList {
    public static void main(String[] args) {
        List<Integer> EvenNumber = new ArrayList<Integer>();
        for(int i =0; i<=50;i++){
            if(i%2==0){
                EvenNumber.add(i);
            }
        }
        System.out.println(EvenNumber);
        System.out.println("-----------------------------");
        for(int i=0;i<EvenNumber.size();i++){
            System.out.println(EvenNumber.get(i));
        }

    }
}
