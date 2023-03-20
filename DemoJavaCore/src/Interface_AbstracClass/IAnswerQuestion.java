package Interface_AbstracClass;

public interface IAnswerQuestion extends IDoTest {
    public void answer();

    public static String getToken(){
        System.out.println("getToken from Answer");
        return IDoTest.getToken();
    }
}
