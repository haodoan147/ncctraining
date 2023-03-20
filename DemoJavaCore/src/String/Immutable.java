package String;

public class Immutable {
    public static void main(String[] args) {

        // Khởi tạo str1 = "first"
        String str1 = new String("first");
        // Khởi tạo str2 tham chiếu tới str1
        String str2 = str1;
        // String là immutable, bất kì thao tác nào trên String đều tạo ra 1 đối tượng mới
        // str1.concat("-second") sẽ trả về 1 đối tượng String mới có giá trị là "first-second"
        str1 = str1.concat("-second");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}