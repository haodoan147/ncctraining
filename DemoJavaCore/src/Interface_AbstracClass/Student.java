package Interface_AbstracClass;

import java.util.Date;

public class Student extends Person {
    private String studentId;
    private String department;

    private String publishToken = "";

    public Student(int id, String name, Date birthDay, String studentId, String department) {
        super(id, name, birthDay);
        this.studentId = studentId;
        this.department = department;

        publishToken = IDoTest.getToken();
    }
//    @Override
//    static String getToken(){
//        return "11115faf5as51dgd";
//    }
    // Không thể thu hẹp access modifier
    // Không phát sinh ngoại lệ khác loại hoặc không có quan hệ kế thừa
    @Override
    public void thinking() throws NumberFormatException {
        System.out.println("Thinking about subject debt!");
    }
    // super
    @Override
    public void sleeping(){
        super.sleeping();
        System.out.println("Dreaming about tuition debt");
    }
    // không override final, static method
//    @Override
//    public static int getZero() {
//        return 0;
//    }

    @Override
    public void enterLibrary() {
        System.out.println("Student enter library successfully!");
    }

}
