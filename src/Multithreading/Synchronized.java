package Multithreading;


class Window2 implements Runnable {
    private static int t = 100;
//    Object object = new Object();

    @Override
    public void run() {

        while (true) {


            method();
        }

    }

    public synchronized void method() {
        if (t > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + t);
            t--;
        }

    }
}


public class Synchronized {
    public static void main(String[] args) {


        Window2 w2 = new Window2();
        Thread t1 = new Thread(w2);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w2);
        t1.setName("窗口1-");
        t2.setName("窗口2-");
        t3.setName("窗口3-");
        t1.start();
        t2.start();
        t3.start();
    }
}