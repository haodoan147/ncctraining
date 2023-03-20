package Enum;

// kiểu dữ liệu định nghĩa các tập hợp các hằng số
// có thể chứa các trường, phương thức và Constructor
enum Season {
    // so sánh thứ tự
    SPRING, SUMMER, FALL, WINTER;
}
enum Month {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7),
        AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    private int value;
    // Không thể tạo instance từ enum vì enum không cho phép public constructor
//    public Month(int value){}
    private Month(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
}
public class Test {

    // enum in class
    enum Week{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
    }
}

class Test2{
    public static void main(String[] args) {
        // can't call enum in other class
//        Week s = Week.TUESDAY;
//        System.out.println(s);

        // duyệt enum
        for (Season s : Season.values()) {
            System.out.println(s);
        }

        // duyệt enum
        for (Month s : Month.values()) {
            System.out.println(s.name()+ " - " + s.getValue());
        }

        // so sánh
        Month thang1 = Month.JANUARY;

        System.out.println(thang1.equals(Month.JANUARY));
        System.out.println(thang1==Month.JANUARY);
    }
}
