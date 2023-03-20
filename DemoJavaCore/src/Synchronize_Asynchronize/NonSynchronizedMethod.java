package Synchronize_Asynchronize;

class ThreadOne extends Thread {

    NonSynchronizedMethod nonSynchronizedMethod;

    public ThreadOne(NonSynchronizedMethod nonSynchronizedMethod) {
        this.nonSynchronizedMethod = nonSynchronizedMethod;
    }

    @Override
    public void run() {
        nonSynchronizedMethod.printNumbers();
    }
}
class ThreadTwo extends Thread {

    NonSynchronizedMethod nonSynchronizedMethod;

    public ThreadTwo(NonSynchronizedMethod nonSynchronizedMethod) {
        this.nonSynchronizedMethod = nonSynchronizedMethod;
    }

    @Override
    public void run() {
        nonSynchronizedMethod.printNumbers();
    }
}
public class NonSynchronizedMethod {

    public void printNumbers() {
        System.out.println("Starting to print Numbers for " + Thread.currentThread().getName());

        // synchronized block
//         synchronized (this) {
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread().getName() + " " + i);
//            }
//        }

        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        System.out.println("Completed printing Numbers for " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        NonSynchronizedMethod nonSynchronizedMethod = new NonSynchronizedMethod();

        ThreadOne threadOne = new ThreadOne(nonSynchronizedMethod);
        threadOne.setName("ThreadOne");


        threadOne.start();
        ThreadTwo threadTwo = new ThreadTwo(nonSynchronizedMethod);
        threadTwo.setName("ThreadTwo");
        threadTwo.start();


    }
}