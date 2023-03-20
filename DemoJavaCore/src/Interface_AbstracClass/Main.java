package Interface_AbstracClass;

import java.util.Date;

public class Main {
    static void login(Person person) {
        System.out.println("Person login successfully!");
    }

    static void login(Student student) {
        System.out.println("Student login successfully!");
    }

    public static void main(String[] args) {
        try {
            Student student = new Student(1, "Bill", new Date(), "20110641", "IT");
            Instructor instructor = new Instructor(1, "Musk", new Date(), "Ins001", "IT", 4);

            // call method implement from interface
            instructor.doQuestion("11115faf5as51dgd");
            System.out.println(instructor.getDiem("11115faf5as51dgd"));

            // method overriding from Person()
            student.sleeping();

            Caculation caculation = new Caculation();
            System.out.println(caculation.sum("39", "79"));
            System.out.println(caculation.sum(5, 5, 5, 5));


            Person person = new Person(1, "Bill", new Date()) {
                @Override
                public void enterLibrary() {

                }

                @Override
                public void thinking() {

                }
            };
            Person obj_person = new Student(1, "Bill", new Date(), "20110641", "IT");

            login(person);
            login(student);
            login(obj_person);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}