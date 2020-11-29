package Multithreading;

/**
 * 1.问题:卖票过程中,出现了重票、错票-->出现了线程的安全问题
 * 2.问题出现的原因:当某个线程操作车票的过程中,尚未操作完成时,其他线程参与进来,也操作车票
 * 3.如何解决:当一个线程a在操作 ticket的时候,其他线程不能参与进来。直到线程操作完 ticket.时,
 * 线程才可以开始操作 ticket。这种情況即使线程a出现了阻塞,也不能被改变
 * 4.在java中,我通过同步机制,来解决线程的安全问题。
 * <p>
 * <p>
 * 方式一:同步代码块
 * <p>
 * synchronized(同步监视器){
 * //需要被同步的代码
 * }
 * <p>
 * 说明:
 * 1.操作共享数据的代码,即为需要被同步的代码
 * 2.共享数据:多个线程共同操作的変量。比如: ticket就是共享数据
 * 3.同步监视器,俗称:锁。任何一个类的对象,都可以充当锁。
 * 要求:多个线程必须要共用同一把锁
 *
 *
 *
 * 方式二：同步方法
 *
 * 1.同步方法仍然涉及到同步监视器,只是不需要我们显式的声明
 * 2.非静态的同步方法,同步监视器是:this
 *  静态的同步方法,同步监视器是:当前类本身
 *
 * 5.同步的方式,解了线程的安全向题。---好处
 *   操作同步代码时,只能有一个线程参与,其他线程等待。相当于是一个单线程的过程,效率低--局限性
 */

class Window implements Runnable {
    private static int t = 100;
//    Object object = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (this) {

                if (t > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + t);
                    t--;
                } else {
                    break;
                }
            }
        }
    }
}

public class maipiaoTest {
    public static void main(String[] args) {


        Window w1 = new Window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口1-");
        t2.setName("窗口2-");
        t3.setName("窗口3-");
        t1.start();
        t2.start();
        t3.start();
    }
}
