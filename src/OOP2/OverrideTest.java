package OOP2;

/**
 * 重写：子类继承父类后，可以对父类中同名同参数的方法，进行覆盖操作
 * 规定
 * 1、子父类中的方法名和形参列表名必须相同
 * 2、子类权限修饰符>=父类的权限修饰符  并且  子类不能重写父类中声明的 private权限方法
 * 3、子类抛出异常类型 >= 父类 抛出异常类型
 * 4、子父类需要为 非static
 */


public class OverrideTest {
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.eat();
    }

}
