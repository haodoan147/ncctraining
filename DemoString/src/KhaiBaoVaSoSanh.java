public class KhaiBaoVaSoSanh {
    public static void main(String[] args) {
        // String intering
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        // heap
        String s4 = new String("Hello");
        String s5 = new String("Hello");

        // Nếu value khi khai báo bằng tính nguyên thủy giống nhau thì chúng cùng tham chiếu 1 đối tượng
        s1 = "Hello";
        System.out.println(s1 == s1);         // true
        System.out.println(s1 == s2);         // true
        System.out.println(s1 == s3);         // true
        System.out.println(s1 == s4);         // false
        System.out.println(s4 == s5);         // false

//        Manual Interning to put the String into String pool (inside heap)
        String s6 = s5.intern();
        System.out.println(s1 == s6);         // true

        s1.equals(s3);    // true, cùng nội dung
        s1.equals(s4);    // true, cùng nội dung
        s4.equals(s5);    // true, cùng nội dung.
    }
}
