package Enumeration;

/**
 * 一、 枚举类的使用
 * 1.枚举类的理解:类的对象只有有限个，确定的。我们称此类为枚举类
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式。
 * 二、如何定义枚举类
 * 方式一: jdk5.0之前，自定义枚举类
 * 方式二: jdk5.0，可以使用enum关键字定义枚举类
 *
 * 三、Enum类的主要方法:
 * ➢values（）方法:返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
 * ➢valueOf（String str）:可以把一 个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字” 。如不是，会有运行时异常:
 * IllegalArgumentException。
 * ➢toString（）:返回当前枚举类对象常量的名称
 * 四、使用enum关键字定义的枚举类实现接口的情况
 * 情况一:实现接口，在enum类中实现抽象方法
 * 情况二:让枚举类的对象分别实现接口中的抽象方法
 */
public class Enumerationtest {
    public static void main(String[] args) {
        Reason reason = Reason.a;
        System.out.println(reason);
        Reason1 reason1 = Reason1.a;
        //tostring（）；
        System.out.println(reason1.toString());
        //values()
        Reason1[] values = Reason1.values();
        for (int i =0;i<values.length;i++){
            System.out.println(values[i]);
        }
        //valueOf
        Reason1 a = Reason1.valueOf("a");
        System.out.println(a);

    }

}

/**
 * 方式一: jdk5.0之前，自定义枚举类
 */
class Reason {
    //1.声明Reason对象的属性:private final 修饰
    private final String name;
    private final String age;

    //2.私有化类的构造器，并给对象属性赋值
    private Reason(String name, String age) {
        this.name = name;
        this.age = age;
    }

    //3.提供当前枚举类的多个对象: public static final的
    public static final Reason a = new Reason("a", "a");
    public static final Reason b = new Reason("b", "b");

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Reason{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

/***
 * 方式二: jdk5.0，可以使用enum关键字定义枚举类
 * 使用enum关键字定义枚举类
 * 说明:定义的枚举类默认继承于java. lang. Enum类
 */

interface Info{
    void show();
}
enum Reason1 implements Info{
    //1.提供当前枚举类的对象，多个对象之间用"， "隔开，末尾对象"；"结束
    a("a", "a"){
        @Override
        public void show() {
            System.out.println("aaa");
        }
    },
    b("b", "b"){
        @Override
        public void show() {
            System.out.println("bbb");
        }
    };
    //2.声明Reason对象的属性:private final 修饰
    private final String name;
    private final String age;

    //3.私有化类的构造器，并给对象属性赋值
    private Reason1(String name, String age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

//    @Override
//    public String toString() {
//        return "Reason{" +
//                "name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                '}';
//    }
/*
情况一:实现接口，在enum类中实现抽象方法
 */
//    @Override
//    public void show() {
//
//    }
}