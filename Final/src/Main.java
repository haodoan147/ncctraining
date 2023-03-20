public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Company c1 = new Company(1, "VN");

        Company c2 = new Company(2, "USA");

        c1.setState("UK");
        System.out.println(c1.getState());

    }
}