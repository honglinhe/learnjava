package Multithreading;

/**
 * 多线程的创建,
 *
 * 方式一:继承于 Thread 类
 *  1.创建一个继承于 Thread类的子类
 *  2.重写 Thread 类阶run()-ー>将此线程放行的操作声明在run()中
 *  3.创建 MyThread类的子类的对象
 *  4.通过此对象调 start()
 *
 *
 *  注： 不可以通过直接调用run（）方法的方式启动线程
 *
 */

//1.创建一个继承于 Thread类的子类
class MyThread extends Thread{
//    2.重写 Thread 类阶run()-ー>将此线程放行的操作声明在run()中
    @Override
    public void run() {
        for (int i = 0 ; i<1;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
//        Thread t1 = new Thread();
//        3.创建 MyThread类的子类的对象
        MyThread t1 =new MyThread();
//        4.通过此对象调 start()
        t1.start();

        Thread.currentThread().setName("祝线程");
        for (int i = 0 ;i<1;i++){
            System.out.println(Thread.currentThread().getName()+i+"********");
        }
        /**
         * Thread 的匿名子类
         */
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"aaa");
            }
        }.start();

    }
}
