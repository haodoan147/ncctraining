package String;

public class Mutable {
    public static void main(String[] args) {
        // Khởi tạo str1 = "first"
        StringBuffer str1 = new StringBuffer("first");
        // Khởi tạo str2 tham chiếu tới str1
        StringBuffer str2 = str1;
        // StringBuffer là mutable, do đó khi append thì giá trị của nó sẽ thay đổi trên chính vùng nhớ ban dầu
        str1.append("-second");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }
}
