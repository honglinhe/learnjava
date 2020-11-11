package OOP2;

/**
 * 继承性的好处：
 * 减少冗余，提高复用性
 *
 * 格式：class A extends B { }
 *
 * 规定1、一个类可以有多个子类继承
 * 2、java中的继承是单继承的
 * 3、子父类是相对的概念
 * 4、如果我们没有显式的声明一个类的父类的话，则此类继承于java.lang.Object类
 * 5、不同包下的普通类 ， 不可以调用声明为private、缺省、protected权限的属性和方法
 */

public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        Student s1 = new Student();
        s1.name = "tom";
        System.out.println(s1.name);

    }
}
