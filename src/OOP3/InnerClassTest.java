package OOP3;

/**
 *
 * 类的内部成员之五:内部类
 *
 * 1、Java中允许将一个类A声明在另一个类B中,则类A就是内部类,类B称为外部类
 *
 * 2、内部类的分类: 成员内部类(静态、非静态) Vs 局部内部类(方法内、代码块内、构造器内)
 * 3、成员内部类:
 *  一方面,作为外部类的成员
 *      >调用外部类的结构
 *      >可以被static修饰
 *      >可以被4种不同的权限修饰
 *  另一方面,作为一个类
 *      >类内可以定义属性、方法、构造器等
 *      >可以被final修饰,表示此类不能被继承。言外之意,不使用final,就可以被继承
 *      >可以被 abstract修饰
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建 静态成员内部类的实例
        Person4.Dog dog = new Person4.Dog();
        dog.m();
        //创建 非静态成员内部类的实例
        Person4 p1 = new Person4();
        Person4.Bird bird= p1.new Bird();
        bird.show();
        bird.display("display");
    }
}


class Person4{
    String name = "Person4";

    public void eat(){

    }
    //静态的成员内部类
    static class Dog{

        public void m(){
            System.out.println("dog");
        }
    }
    //非静态的成员内部类
    public class Bird{
        String name = "brid";
        public Bird(){

        }
        public void show(){
            Person4.this.eat();
        }
        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name); //内部类的属性
            System.out.println(Person4.this.name);//外部类的属性
        }
    }

    /**
     * 局部内部类
     */
    public Comparable getComparable(){

        //方式一
//        class MyComparable implements Comparable{
//
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();
//

        //方式二
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}