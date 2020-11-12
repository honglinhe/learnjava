package OOP3;

/**
 *
 * 1.静态代码块
 * >内部可以有输出语句
 * >随着类的加载而执行而且只执行一次
 * >作用:初始化类的信息
 * >如果一个类中定义了多个静态代码块,则按照声明的先后顺序执行
 * >静态代码块的执行要优先于非静态代码块的执行
 * >静态代码块内只能调用静态的属性、静态的方法,不能调用非静态的结构
 *
 * 2.非静态代码块
 * >内部可以有输出语句
 * >随着对象的创建而执行
 * >每创建一个对象,就执行一次非静态代码块
 * >作用:可以在创建对象时,对对象的属性等进行初始化
 * >如果一个类中定义了多个非静态代码块,则按照声明的先后顺序执行
 * >非静态代码块内可以调用静态的属性、静态的方法,或非静态的属性、非静态的方法
 *
 * 对属性可以赋值的位置:
 * 1、默认初始化
 * 2、显式初始化
 * 3、构造器中初始化
 * 4、有了对象以后,可以通过"对象.属性”或对象.方法"的方式,进行赋值
 * 5、在代码块中赋值
 */
public class BlockTest {
    public static void main(String[] args) {
        String s1 = Person1.desc;
        //static block-1
        //static block-2
        Person1 p1 = new Person1();// block
        Person1 p2 = new Person1(); //block

    }
}

class Person1 {
    //属性
    String name;
    int n;
    static String desc = "ren";

    //构造器
    public Person1(String name, int n) {
        this.name = name;
        this.n = n;
    }

    public Person1() {
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

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", n=" + n +
                '}';
    }
}