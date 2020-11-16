package 异常处理;

/**
 * throw:手动抛出异常对象
 * throw和 throws区别:
 * throw表示抛出一个异常类的对象,生成异常对象的过程。声明在方法体内
 * throws属于异常处理的一种方式,声明在方法的声明处
 */
public class ThrowTest {
    public static void main(String[] args) {
        try {
            ThrowTest t = new ThrowTest();
            t.r(-1);
            System.out.println(t);
        } catch (MyException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    private int a;

    public void r(int a) throws MyException{
        if (a > 0) {
            this.a = a;
        } else {
//            throw new RuntimeException("错误");
            throw new MyException("错误");
        }
    }
}


