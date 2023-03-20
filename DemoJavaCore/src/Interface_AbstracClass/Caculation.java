package Interface_AbstracClass;

public class Caculation implements ICaculation {
    @Override
    public String sum2(String a, String b) {
        return null;
    }

    @Override
    public String sum3(String a, String b, String c) {
        return null;
    }

    @Override
    public String sum4(String a, String b, String c, String d) {
        return null;
    }

    @Override
    public String sum5(double a, double b, double c, double d) {
        return null;
    }

    @Override
    public String sum(String a, String b) {
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return String.valueOf((numA + numB));
    }

    @Override
    public String sum(String a, String b, String c) {
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        double numC = Double.parseDouble(c);
        return String.valueOf((numA + numB + numC));
    }

    @Override
    public String sum(String a, String b, String c, String d) {
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        double numC = Double.parseDouble(c);
        double numD = Double.parseDouble(d);
        return String.valueOf((numA + numB + numC + numD));
    }

    @Override
    public String sum(Integer a, Integer b, Integer c, Integer d) {
        return String.valueOf((a + b + c + d));
    }

    @Override
    public String sum(double a, double b, double c, double d) {
        System.out.println("Call fuction with double params");
        return String.valueOf((a + b + c + d));
    }
}
class Test3{
    public static void main(String[] args) {
        Caculation caculation = new Caculation();
        System.out.println(caculation.sum("2","3"));
        // Compiler ưu tiên kiểu rộng hơn trước hàm bao
        System.out.println(caculation.sum(1, 2, 3 ,4 ));
        System.out.println(caculation.sum("1", "2", "3" ,"4" ));
    }
}
