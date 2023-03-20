package TryCatch_ThrowException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


// FileNotFoundException is a checked exception
// anyone that calls our method now needs to handle it too!
public class Test {

    // throw
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }

    // unchecked exception
    static void a() {
        int data = 50 / 0;
    }

    static void b() {
        a();
    }

    static void c() {
        try {
            b();
        } catch (ArithmeticException e) {
            System.out.println("exception handled at c()");
        }
    }

    // checked exception require throws or try catch
    void m() throws IOException {
        throw new java.io.IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    // finally
    public static int getDataInFile(String stringFile) {

        Scanner contents = null;

        try {
            contents = new Scanner(new File(stringFile));
//        try (Scanner contents = new Scanner(new File(stringFile))) {
            return Integer.parseInt(contents.nextLine());
//            int a = Integer.parseInt("sdgsdgs");
            // finally will be called after catch
        } catch (FileNotFoundException e) {
            System.out.println(("File not found, resetting score."));
            return 0;
            // multi catch and union catch
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(("Wrong parse number format."));
            return 0;
            // swallow catch
        } catch (Exception e) {
            throw new NullPointerException();
        } finally {
            if (contents != null) {
                contents.close();
            } else {
                System.out.println("Finally: contents is null!");
                return 1;
            }
        }
    }



    public static void main(String args[]) {
        validate(13);
////
////        try{
////            validate(13);
////        }catch (ArithmeticException e){
////            System.out.println("Vui lòng quay lại khi bạn 18 tuổi.");
////        }
//
//        c();
//
//        try {
//            getDataInFile("");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//            System.out.println(getDataInFile(""));

    }
}
