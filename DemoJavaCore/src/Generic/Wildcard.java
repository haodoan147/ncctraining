package Generic;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("ve hinh tron");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("ve hinh Vuong");
    }
}


public class Wildcard {

    // Wildcard được dùng khi t muốn xử lý một dữ liệu mà chưa biết kiểu dữ liệu của nó
    public static void drawShapesCircle(List<Circle> lists) {
        for (Circle s : lists) {
            s.draw(); // call method của lớp Shape từ lớp con
        }
    }
    public static void drawShapesCircleSqure(List<Square> lists) {
        for (Square s : lists) {
            s.draw(); // call method của lớp Shape từ lớp con
        }
    }
    // drawShapes chỉ chấp nhận các kiểu thuộc lớp Shape hoặc con của nó
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw(); // call method của lớp Shape từ lớp con
        }
    }
    // Ngoài list có thể dùng cho rất nhiều kiểu Generic khác
    // extends != super
//    public static void drawShapes(Collection<? super Square> lists) {
//    }

    public static void main(String args[]) {
        List<Square> list1 = new ArrayList<Square>();
        list1.add(new Square());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }

}
