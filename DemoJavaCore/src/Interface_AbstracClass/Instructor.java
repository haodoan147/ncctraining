package Interface_AbstracClass;

import java.util.Date;

public class Instructor extends Person implements IAnswerQuestion, ICreatingTest{
    private String instructorId = "";
    private String department = "";

    private int classQuatity;

    public Instructor(int id, String name, Date birthDay, String instructorId, String department, int classQuatity) {
        super(id, name, birthDay);
        this.instructorId = instructorId;
        this.department = department;
        this.classQuatity = classQuatity;
    }

    @Override
    public void answer() {
        System.out.println("Instructor answer question 1");
    }

    @Override
    public void creatingQuestion() {
        System.out.println("Instructor create question 1");
    }

    @Override
    public void checkingQuestion() {
        System.out.println("Instructor check question 1");
    }

    @Override
    public void doQuestion(String token) {
        if (IAnswerQuestion.getToken().equals(token)){
//            this.enrollTest();
            System.out.println("Doing test........");
            answer();
            System.out.println("Test complete!");
        }
        else
            System.out.println("Wrong token!");
    }

    @Override
    public int getDiem(String token) {
        if (IDoTest.getToken().equals(token)){
            return 10;
        }
        else
            return 0;
    }

    @Override
    public void thinking() throws NumberFormatException {
        System.out.println("Thinking about creating question.");
    }

    @Override
    public String getName() {
        String str = super.getName();
        return "Instructor " + str;
    }

    @Override
    public void enterLibrary() {
        System.out.println("Enter library successfully!");
    }
}
