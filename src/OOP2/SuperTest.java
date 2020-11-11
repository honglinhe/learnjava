package OOP2;

/**
 * super的使用
 * super理解为：父类的；可以用于调用：属性、方法、构造器
 * 当子父类的属性和方法同名的时候，使用"super.属性/方法"，表示调用的是父类的属性和方法
 * 构 造 器 ：1、我们可以在子类的构造器中显式的使用" super(形参列表)"的方式,调用父类中声明的指定的构造器
 * 2、" super(形参列表)"的使用,必须声明在子类构造器的首行
 * 4、我们在类的构造器中,针对于"this(形参列表)"或" super(形参列表)"只能二选一,不能同时出现 在构造器的首行,没有显式的声明"this(形参列表)"或" super(形参列表)",则默认调用的是父类中空参的构造器
 * 5、在类的多个构造器中,至少有一个类的构造器中使用了" super(形参列表)",调用父类中的构造器
 */
public class SuperTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.name = "学生";
        s.age = 10;
        s.show_name_age();
    }


}
