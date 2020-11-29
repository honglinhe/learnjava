package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三 ： 实现Callable接口
 *
 *如何理解实现 callable接口的方式的建多线程比实现 Runnable接口建多线程方式强大?
 * 1.call()可以有返回值的
 * 2.call()可以抛出异常,被外面的操作捕获,获取异常的信息
 * 3. Callable是支持泛型的
 */
//1、创建一个实现Callable的实现类
class Test2 implements Callable {
    //2、实现call方法，将此线程需要执行的操作声明在call（）中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }

}

public class CallableTest {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        Test2 test2 = new Test2();
        //4.将此 Callable接口实现类的对象作为传递FutureTask构造器中,创建 FutureTask的对象
        FutureTask futureTask = new FutureTask(test2);
        //5.将 FutureTask的对象作为参数传递到 Thread 类的构造器中,创建Thread对象,并调用 start()
        new Thread(futureTask).start();
        try {
            //6,获取 Callable中call方法的返回值
            //get()返回值即为 Future Task构造器参数 Callable-实现类重写call()的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
