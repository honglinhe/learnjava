package OOP3;

/**
 * 单例式的懒汉式
 *
 * 区分饿汉式和懒汉式
 * 饿汉式:
 * 坏处:对象的加载时间过长。
 * 好处:饿汉式是线程安全的
 * 懒汉式:
 * 好处:延迟对象的创建。
 * 目前的写法坏处:线程不安全--->到多线程内容时,再修改
 */
public class SingletonLanhanTest {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);//true
    }
}

class Order {
    //1.私有化类的构造器
    private Order() {
    }

    //2.声明当前对象,没有初始化
    //4.此对象也必须声明为static的
    private static Order instance = null;

    //3.声明pub1ic、 static的返回当前类对象的方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}