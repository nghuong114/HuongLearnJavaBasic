package Variables;

public class SinhVien {
    public  int Tuoi ;
    public static String Ten="Nguyen Van A";
    public void Truong(){
        String Truong = "HUB";
        System.out.println("School:"+Truong);
    }

    public static void main(String[] args) {
        SinhVien Student = new SinhVien();
        System.out.println("Name: "+ Student.Ten);
        Student.Tuoi =19;
        System.out.println("Age:"+ Student.Tuoi);

        Student.Truong();
        ThongTin Info = new ThongTin();
        Info.Lop = "DH35DN02";
        System.out.println("Class:"+Info.Lop);
    }
}

