package Interface_AbstracClass;

interface Printable{
    void print();
}
interface Showable{
    void print();
}

class WhyMultiInheritance implements Printable, Showable{
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        WhyMultiInheritance obj = new WhyMultiInheritance();
        obj.print();
    }
}