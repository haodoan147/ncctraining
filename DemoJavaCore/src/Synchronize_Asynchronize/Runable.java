package Synchronize_Asynchronize;

class testSync {

    class RunnableImpl implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"-write-"+i);
            }
        }
    }

    ;

    class RunnableImpl1 implements Runnable {
        @Override
        public void run() {
            for (int j = 5; j < 10; j++) {
                System.out.println(Thread.currentThread().getName()+"-write-"+j);
            }
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new testSync().new RunnableImpl());
        Thread t2 = new Thread(new testSync().new RunnableImpl1());
        t1.start();
        t2.start();

    }
}

