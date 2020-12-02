package CommonClass.String;

import OOP2.Person;
import org.junit.Test;

/**
 * string:字符串,使用一对""引起来表示。
 * <p>
 * 1. String声明final的,不可被继承
 * 2. String 实现了 Serializable 接口:表示字符串是支持序列化的
 * 实现了 Comparable   接口:表示String可以比较大小
 * 3. String内部定义了 final char[] value用于存储字符串数据
 * 4. String:代表不可変的字符序列。筒称:不可変性
 * 体现:1.当对字符串重新赋值时,需要重写指定内存区域赋值,不能使用原有的value进行赋值
 * 2.当对现有的字符串进行连接操作时,也需要重新指定内存区域赋值,不能使用原有的value
 * 3.当调用 string的 replace()方法修改指定字符或字符串时,也需要重新指定内存区域赋值,不能使用原有的value
 * 5.通过字面量的方式(区别new)给一个字符串赋值,此时的字符串值声明在字符串常量池中
 * 6.字符串常量池中是不会存储相同内容的字符串的
 * 体现:
 */
public class StringTest {
    /**
     * 1.常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
     * 2.只要其中有一个是变量,结果就在堆中
     * 3.如果拼接的结果调用 intern()方法,返回值就在常量池中
     */
    @Test
    public void test2() {
        String s1 = "javaee";
        String s2 = "hadoop";
        String s3 = "javaeehadoop";
        String s4 = "javaee" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaee" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4); //true
        System.out.println(s3 == s5); //false
        System.out.println(s3 == s6); //false
        System.out.println(s3 == s7); //false
        System.out.println(s5 == s6); //false
        System.out.println(s5 == s7); //false
        System.out.println(s6 == s7); //false


        String s8 = s6.intern();//返回值得到的s8使用的常量值中已经存在的"javaeehadoop"
        System.out.println(s3 == s8); //true
    }

    /**
     * string的实例化方式:
     * 方式一:通过字面量定义的方式
     * 方式ニ:通过new+构造器的方式
     * String s= new String("abc")；方式创建对象,在内存中的建了几个对象?
     * 两个:一个是堆空同中new结构,
     * 另ー个是char[]对应的常量池中的数据:"abc"
     */
    @Test
    public void test1() {

        //通过字面量定义的方式:此时的s1和2的数据 Javaee声明在方法区中的字符串常量池中
        String s1 = "Javaee";
        String s2 = "Javaee";
        //通过new+构造器的方式:此时的s3和s4保存的地址值,是数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("javaee");
        String s4 = new String("javaee");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //false
        System.out.println(s3 == s4); //false
        System.out.println("*************");
        String name;
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);
        System.out.println(p1.name.equals(p2.name)); //true
        System.out.println(p1.name == p2.name); //true
        p1.name = "aa";
        System.out.println(p2.name);
    }

}
