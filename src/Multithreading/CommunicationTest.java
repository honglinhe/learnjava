package Multithreading;

/**
 *
 *
 * wait():一旦执行此方法,当前线程就进入阻塞状态,并释放同步监视器。
 * notify():ー旦执行此方法,就会唤醒被如t的一个线程。如果有多个线程wait,就唤醒优先级高
 * notifyAll():一旦执行此方法,就会唤醒所有wait的线程
 *
 * 说明:
 * 1.wait(), notify(), notifyall()三个方法必须使用在同步代码块或同步方法中
 * 2.wait(), notify(), notifyall()三个方法的调用者必须是同步代码块或同歩方法中的同步监视
 *  否则,会出现 Illegalmonitorstateexception 异常
 * 3.wait(), notify(), notifyall()三个方法是定义在java.Lang.Object类中。
 *
 *
 * sleep()和wait()的异同:
 * 1.相同点:一旦执行方法,都可以使得当前的线程进入阻塞状态
 * 2.不同点:
 * 1)两个方法声明的位置不同: Thread.类中声明 sleep(), object:类中声wait()
 * 2)调用的要求不同: sleep()可以在任何需要的场景下调用。
 * Wait()必须使用在同步代码块或同步方法中
 * 3)关于是否释放同步监视器:如果两个方法都使用在同代码块或同步方法中, sleep()不会释放锁，而wait()会释放锁
 */
class Test1 implements Runnable{
    private int i =1;

    @Override
    public void run() {
        while (true){


            synchronized (this) {
                notify();
                if (i<=100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"-"+i);
                    i++;
                }else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


public class CommunicationTest {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test1);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
