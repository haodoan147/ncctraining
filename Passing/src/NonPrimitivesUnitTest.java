import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonPrimitivesUnitTest {

    @Test
    public void whenModifyingObjects_thenOriginalObjectChanged() {
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        // Before Modification
        assertEquals(a.num, 1);
        assertEquals(b.num, 1);

        modify(a, b);

        // After Modification
        assertEquals(a.num, 2); // ????? -> Solution
        assertEquals(b.num, 1);
    }

    public static void modify(Foo a1, Foo b1) {
        a1.num++;

        b1 = new Foo(1);
        b1.num++;
    }

//    public static void modify(int num1, int num2) {
//    }

//    modify(new Foo(a), new Foo(b));
//    public static void modify(Foo a1, Foo b1) {
//        a1 = new Foo(a1);
//        a1.num++;
//
//        b1 = new Foo(b1);
//        b1.num++;
//    }
}

class Foo {
    public int num;

    public Foo(int num) {
        this.num = num;
    }

    public Foo(Foo foo) {
        this.num = foo.num;
    }
}