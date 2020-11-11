package OOP2;

/**Object类中的方法
 * equals()/toString()/getClass()/hashCode()/clone()/
 * finalize()/ wait()、 notify()、 notifyAll()
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}

class Order{}
