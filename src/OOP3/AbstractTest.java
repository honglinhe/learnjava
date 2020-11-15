package OOP3;

/**
 * 1. abstract:抽象的
 * 2. abstract可以用来修饰的结构:类、方法
 *
 * 3. abstract修饰类:抽象类
 *      >此类不能实例化
 *      >抽象类中一定有构造器,便于子类实例化时调用(涉及:子类对家实例化的全过程)
 *      >开发中,都会提供抽象类的子类,让子类对象实例化,完成相关的操作
 *
 * 4. abstract修饰方法:抽象方法
 *      >抽象方法只有方法的声明,没有方法体
 *      >包含抽象方法的类,一定是一个抽象类。反之,抽象类中可以没有抽象方法的
 *      >若子类重写了父类中的所有的抽家方法后,此子类方可实例化
 *      若子类没有重写父类中的所有的抽象方法,则此子类也是一个抽象类,需要使用 abstract修饰
 */
public class AbstractTest {
    public static void main(String[] args) {
//        抽象化后就不能实例化了
//        Person2 p1 = new Person2();
    }
}
abstract class Person2 {
    //属性
    String name;
    int n;
    static String desc = "ren";

    //构造器
    public Person2(String name, int n) {
        this.name = name;
        this.n = n;
    }

    public Person2() {
    }

    //代码块
    static {
        System.out.println("static block-1");
    }
    static {
        System.out.println("static block-2");
    }

    {
        System.out.println("block");

    }


    //方法
    public void eat() {
        System.out.println("吃");
    }
    public abstract void walk();


    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", n=" + n +
                '}';
    }
}

abstract class Student2 extends Person2{

}