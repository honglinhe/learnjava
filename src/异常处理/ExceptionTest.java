package 异常处理;

import java.util.Date;

/**
 * \
 * <p>
 * <p>
 * java.lang.Throwable
 * java.1ang. Error:一般不编写针对性的代码进行处理。
 * java.1ang. Exception:可以进行异常的处理
 * <p>
 * <p>
 * 1 编译时异常(checked)
 * <p>
 * 1.1IOException
 * FileNotFoundException
 * 1.2 ClassNotFoundException
 * <p>
 * <p>
 * 2 运行时异常( unchecked)
 * <p>
 * 2.1 NullPointerException
 * 2.2 ArrayIndexOutOfBoundsException
 * 2.3 ClassCastException
 * 2.4 NumberFormatException
 * 2.5 InputMismatchException
 * 2.6 ArithmeticException
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Exception e = new Exception();
        e.test();
    }
}

class Exception extends Throwable {
    public Exception(String 错误) {
    }

    public Exception() {

    }

    public void test() {
        //ArrayIndexOutOfBoundsException
//        int[] arr =  new int[10];
//        System.out.println(arr[10]);

//        NullPointerException
//        String str = null;
//        System.out.println(str.charAt(0));

//        ClassCastException
//        Object o = new Date();
//        String s = (String) o;


//        NumberFormatException
//        String s = "aa";
//        int n = Integer.parseInt(s);


    }
}