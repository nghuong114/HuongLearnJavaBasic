package LearnCollections;

import java.util.*;

public class Staff {
    private String name;
    private int age;
    private String department;
    //Khoi tao Staff info
    public Staff(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    //overwrite function to convert list to string
    public String toString(){
        return this.name+","+this.age+","+this.department;
    }

    public static void main(String[] args) {
        //create staff info
        Staff staff1 = new Staff("Nguyen Van A", 30, "Product");
        Staff staff2 = new Staff("Nguyen Van B", 25, "IT");
        Staff staff3 = new Staff("Nguyen Van C", 40, "Account");
        Staff staff4 = new Staff("Nguyen Van D", 32, "HR");
        //ARRAY COLLECTION
        //create list staffs
        List<Staff> listStaff = new ArrayList<Staff>();
        //add into list staffs
        listStaff.add(staff1);
        listStaff.add(staff2);
        listStaff.add(staff3);
        listStaff.add(staff4);
        // show info of list staffs
        for(int i=0; i< listStaff.size(); i++) {
            System.out.println(listStaff.get(i).toString());
        }
        System.out.println("----------------------------------------");
        //SET COLLECTION
        Set<Staff> set = new HashSet<Staff>();
        set.add(staff1);
        set.add(staff2);
        set.add(staff3);
        set.add(staff4);
        set.add(staff1);
        Iterator<Staff> itr = set.iterator();

        for (int i=0;i<set.size();i++){
            System.out.println(itr.next().toString());
        }
        System.out.println("\n"+set);
        System.out.println("----------------------------------------");
        //MAP COLLECTION
        Map<Integer,Staff> map = new HashMap<Integer,Staff>();
        map.put(1,staff1);
        map.put(2,staff2);
        map.put(3,staff3);
        map.put(4,staff4);
        System.out.println("\t"+map);
        for (int i=1;i<=4;i++){
            System.out.println(map.get(i));
        }
    }
}
