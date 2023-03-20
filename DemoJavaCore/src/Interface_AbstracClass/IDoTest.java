package Interface_AbstracClass;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public interface IDoTest {
    public Date date = new Date();
    static Date date2 = new Date();
    final Date date3 = new Date();

    abstract void doQuestion(String token);
    public int getDiem(String token);

    default void notification(String str){
        System.out.println(str);
    }
    static void notification2(String str){
        System.out.println(str);
    }
    static void getDateNow(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(Date.from(now.atZone(ZoneId.systemDefault()).toInstant()));
    }
    public static String getToken(){
        getDateNow();
        return "11115faf5as51dgd";
    }

}
