package Multithreading;

/**
 * 创建多线程的方式ニ:实现 Runnable接口
 * 1.创建一个实现了 Runnable接口的类
 * 2.实现类去实现 Runnable中的抽象方法:run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到 Thread类的的构造器中,创建 Thread类的对象
 * 5.通过 Thread 类的对象调用 start()
 *
 *
 * 比较创建线程的两种方式：
 * 开发中:优先选择:实现 Runnable接口的方式
 * 原因:1.实现的方式没有类的单继承的局限性
 *      2.实现的方式更适台来处理多个线程有共享数据的情况。
 *
 * 联系: public class Thread implements Runnable
 *
 * 相同点:两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
 *
 */

//1.创建一个实现了 Runnable接口的类
class Thread2 implements Runnable {
    //2.实现类去实现 Runnable中的抽象方法:run()
    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName() + 1);

    }
}

public class CreatThread {
    public static void main(String[] args) {
//        3.创建实现类的对象
        Thread2 t2 = new Thread2();
//4.将此对象作为参数传递到 Thread类的的构造器中,创建 Thread类的对象
        Thread c1 = new Thread(t2);
//        5.通过 Thread 类的对象调用 start():1⃣️启动线程 2⃣️调用当前线程的run()-->调用了 Runnable类型的 target的run()
        c1.start();
    }
}
