package 异常处理;

/**
 * throw:手动抛出异常对象
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


