package Interface_AbstracClass;

class A{
    int i=5;
    public void dis(){
        System.out.println("A");
    }
}

class B extends A{
    int i = 10;
    @Override
    public void dis(){
        System.out.println("B");
    }
}
class Test {
    public static void main(String[] args) {

        A a = new B();
        System.out.print(a.i);
        a.dis();

//         Mutable
        int[] a1 = {10};
        int[] a2 = a1;
        a2[0] = 20;
        System.out.println(a1[0]);
        System.out.println(a2[0]);

        // Immutable
        int a3 = 10;
        int a4 = a3;
        a3 = 20;
        System.out.println(a3);
        System.out.println(a4);

//        Date date = new Date(122, 02, 02);
//        String personName = "Elon";
//        Person person1 =  new Student(1, personName, date, "001", "IT");
//        Person person2 =  new Student(2, personName, date, "002", "IT");

//        System.out.println("Mutable demo:");
//        System.out.println("Init:");
//        System.out.println(person1.birthDay);
//        System.out.println(person2.birthDay);
//
//        date.setYear(120);
//
//        System.out.println("Change date: ");
//        System.out.println(person1.birthDay);
//        System.out.println(person2.birthDay);
//
//        person1.birthDay.setDate(03);
//
//        System.out.println("Change person1.birthDay: ");
//        System.out.println(person1.birthDay);
//        System.out.println(person2.birthDay);

//        System.out.println("Immutable demo:");
//        System.out.println("Init:");
//        System.out.println(person1.name);
//        System.out.println(person2.name);
//
//        personName = "Ben";
//
//        System.out.println("Change personName: ");
//        System.out.println(person1.name);
//        System.out.println(person2.name);
//
//        person1.name = "Leo";
//
//        System.out.println("Change person1.name: ");
//        System.out.println(person1.name);
//        System.out.println(person2.name);

    }
}
