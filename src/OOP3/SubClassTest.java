package OOP3;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();

        //1、接口中定义的静态方法，只能通过 接口 来调用
        JDK8.method1();
        //2、通过实现类的对象，可以调用接口中的 默认 方法
        //如果实现类重写了接口中的默认方法,调用时,仍然调用的是重写以后的方法
        s.method2();
        //3、如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的默认方法,
        //那么子类在没有重写此方法的情祝下,默认调用的是父类中的同名同参数的方法。
        // -->类优先原则

        //4、如果实现类实现了多个接口,而这多个接口中定义了同名同参数的默认方法,
        // 那么在实现类没有重写此方法的情况下,报错。-->接口冲突。
        //这就需要我们必须在实现类中重写此方法
        s.method3();//Super-method3
    }

}

class SubClass extends SuperClass implements JDK8 {
    public void method2() {
        System.out.println("Sub-method2");
    }
    //5、如何在子类（或实现类）的方法中调用父类、接口中被重写的方法

    public void mythod(){
        //调用自己定义的重写的方法
        method2();
        //调用父类声明的方法
        super.method3();
        //调用接口中的默认方法
        JDK8.super.method2();
        //调用接口中的静态方法
        JDK8.method1();
    }
}