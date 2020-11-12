package OOP3;

/**
 * 一、static:静态的；
 * 二、用static修饰的变量，分为：静态变量（类变量）和非静态变量（实例变量）
 * 实例变量：我们创建了类的多个对象,每个对象都独立的拥有一套类中的非静态属性。
 * 当修改其中一个对象中的非静态属性时,不会导致其他对象中同样的属性值的修改。
 *
 * 静态变量：我们创建了类的多个对象,多个对象共享同一个静态变量。
 * 当通过某一个对家修改静态变量时,会导致其他对象调用此静态变量时,是修改过了的。
 *
 *
 * 静态变量的其他说明：
 * 1、静态变量随着类的加載而加载。可以通过"类,静态变量"的方式进行调用
 * 2、静态变量的加载要早于对象的创建。
 * 3、由于类只会加载一次,则静态变量在内存中也只会存在一份:存在方法区的静态域中。
 *
 * eg:System.out
 *
 * 三、静态方法
 * 1、随着类的加载而加载,可以通过"类.静态方法"的方式进行调用
 * 2、静态方法中,只能调用静态的方法或属性
 * 非静态方法中,既可以调用非静态的方法或属性,也可以调用静态的方法或属性
 * 3、静态的方法中，不能使用this关键字、super关键字
 * 4、关于静态属性和静态方法的使用，从生命周期中理解
 *
 * 四、注意点
 * 开发中,如何确定一个属性是否要声明为static的?
 * > 属性是可以被多个对象所共享的,不会随着对象的不同而不同的。
 *
 * 开发中,如何确定一个方法是否要声明为 static的?
 * > 操作静态属性的方法,通常设置为 static的
 * > 具类中的方法,习惯上声明为 static的。比如:Math、 Arrays、Co1lections
 */
public class StaticTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;


        Person p2 = new Person();
        p2.nation = "CHN";
        System.out.println(p1.nation);//CHN

        Person.nation = "美国";
        System.out.println(Person.nation);//美国

    }

}
class Person{
    int age;
    String name;
    static String nation;
    public void eat(){
        //静态 和 非静态都可以调用
    }
    public static void static1(){
        //不能调用非静态的结构
        //eat();
        //name = "1";

        //可以调用静态的结构
        static2();
        System.out.println(Person.nation);
    }
    public static void static2(){

    }

}