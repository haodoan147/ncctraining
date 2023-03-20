package Static;
class MemberOuterExample {
    private int data = 30;

    class Inner {
        void msg() {
            data = 20;
            System.out.println("data is " + data);
        }
        private void outData(int number){
            System.out.println(number);
        }


//        Inner2 inner2 = new Inner2();
    }

    static class Inner2 {
        void msg() {
            // static nested classes do not have access to any instance members of the enclosing outer class;
//            data = 20;
//            System.out.println("data is " + data);

            // it can only access them through an object's reference
            MemberOuterExample memberOuterExample = new MemberOuterExample();
            System.out.println(memberOuterExample.data);
        }
        // can access all static members of the enclosing class, including private ones
        private void outData(int number){
            System.out.println(number);
        }

        // can't access any attribute, method, class non-static
//        Inner inner = new Inner();
    }

    private int getData(){return data;}
    public static void main(String args[]) {
        MemberOuterExample obj = new MemberOuterExample();
        MemberOuterExample.Inner in = obj.new Inner();

        in.msg();
        in.outData(obj.data);

        MemberOuterExample.Inner2 inner2 = new Inner2();
        inner2.outData(obj.data);
    }
}
//class MemberOuterExample$Inner {
//    final MemberOuterExample this$0;
//
//    MemberOuterExample$Inner() {
//        super();
//        this$0 = MemberOuterExample.this;
//    }
//
//    void msg() {
//        System.out.println((new StringBuilder()).append("data is ")
//                .append(MemberOuterExample.access$000(MemberOuterExample.this)).toString());
//    }
//}
