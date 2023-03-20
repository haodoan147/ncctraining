package Lambda;

@FunctionalInterface
interface Hello {
    public String sayHello(String name, String com);

    // Not suggest
//    static void get(){
//
//    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        Hello s = (name, com) -> "Hello, " + name + ". Welcome to " + com;

//        Hello s0 = () -> {
//            return "Hello Lambda.";
//        };

//        Hello s = name -> "Hello, " + name;

        System.out.println(s.sayHello("intern", "NCC"));
    }
}
