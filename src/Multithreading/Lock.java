package Multithreading;

/**
 * synchronized与Lock的异同?
 *
 * 相同:二者都可以解決线程安全问题
 * 不同: synchronized机制在执行完相应的同歩代码以后,启动的释放同步监视器
 *      Lock需要手动的启动同步 (Lock()),同时结東同步也需要手动的实现( unlock())
 *
 * 2.优先使用顺序
 * Lock->同歩代码块(已经进入了方法体,分配了相应资源)->同步方法(在方法体之外)
 */

import java.util.concurrent.locks.ReentrantLock;

class LockTest1 implements Runnable {
    private int t = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                //调用锁定的方法
                lock.lock();
                if (t > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-" + t);
                    t--;
                } else {
                    break;
                }
            } finally {
                //调用解锁的方法
                lock.unlock();
            }
        }
    }
}

public class Lock {

    public static void main(String[] args) {
        LockTest1 lt = new LockTest1();
        Thread t1 = new Thread(lt);
        Thread t2 = new Thread(lt);
        Thread t3 = new Thread(lt);

        t1.start();
        t2.start();
        t3.start();
    }

}

