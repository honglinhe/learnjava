package 异常处理;

/***
 * 异常处理的方式二:throws+异常类型
 *
 * 1."throws+异常类型"写在方法的声明处。指明此方法执行时,可能会抛出的异常类型。
 * 一日当方法体执行时,出现异常,仍会在异常代码处生成一个异常类的对象,此对象满足 throws后异常
 * 类型时,就会被抛出。异常代码后续的代码,就不再执行!
 *
 * 2.体会:try- catch-finally:真正的将异常给处理掉了。
 * throws的方式只是将异常抛给了方法的调用者。并没有真正将异常处理掉。
 *
 * 3.开发中如何选择使用try- catch-finally还是使用 throws?
 * 3.1如果父类中被重写的方法没有throws方式处理异常,则子类重写的方法也不能使用 throws,意味着如果
 * 子类重写的方法中有异常,必须使用try- catch-finally方式处理。
 *
 * 3.2执行的方法a中,先后又调用了另外的几个方法,这几个方法是递进关系执行的。我们建议这几个方法使用 throws
 * 的方式进行处理。而执行的方法a可以考虑使用try- catch-fina11y方式进行处理
 */
public class ThrowsTest {
    public static void main(String[] args) {
        Throws t = new Throws();
        t.m();
    }
}
class Throws{
    public  void m1(){
        try {
            m();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void m()throws ArrayIndexOutOfBoundsException{
        int[] arr1 = new int[10];
        System.out.println(arr1[10]);
    }
}