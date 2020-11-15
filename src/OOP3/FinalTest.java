package OOP3;

/**
 * final:最终的
 *
 * 1.f1nal 可以用来修饰的结构:类、方法、变量
 *
 * 2.final 用来修饰一个类:此类不能被其他类所继承。
 * 比如: String类、 system类、 Stringbuffer类
 *
 * 3.f1nal 用来修饰方法:表明此方法不可以被重写
 * 比如: object类中getC1ass();
 *
 * 4. f1nal用来修饰变量:此时的"变量"就称为是一个常量
 *
 *  4.1 final修饰属性:可以考虑赋值的位置有:显式初始化、代码块中初始化、构造器中初始化
 *  4.2 final修饰局部变量:
 *  尤其是使用final修饰形参时,表明此形参是一个常量。当我们调用此方法时,给常量形参赋一个实参。一旦赋值
 *  以后,就只能在方法体内使用此形参,但不能进行重新赋值
 *
 *
 *static final用来修饰属性:全局常量
 */
public class FinalTest {
    final int w = 10;
//    int w = 20;
    final int daimakuai;
    final int gouzaoqi;

    {
        daimakuai = 10;
    }
    public FinalTest(){
        gouzaoqi = 10;
    }
    public void show(){
        final int m = 10;//常量
//        m + = 10;
    }
    public void show(final int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
//        System.out.println();
        FinalTest t1 = new FinalTest();
        t1.show(20);

    }


}
final class FinalA{

}

//class M extends FinalA{
//
//}

class AA{
    public final void show(){

    }
}
class BB extends AA{
//    public void show(){}

}