package OOP2;

/**
 * 多态性：父类的引用指向子类的对象
 * <p>
 * 多态的使用：虚拟方法的调用
 * 有了对象的多态性以后没我们子啊编译期，只能调用父类中声明的方法，
 * 但在运行期，我们实际执行的是子类重写父类的方法
 * 总结；编译，看左边 运行，看右边
 * <p>
 * 使用的前提：1、类的继承关系 2、方法重写3、只适用于方法
 */
public class PolymorphismTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.walk();  //学生 子类 的走路
//      p.study();//报错，不能调用子类的特有的方法
        PolymorphismTest a = new PolymorphismTest();
        a.func_PolymorphismTest(new dog_PolymorphismTest());//狗吃骨头
/**
 * 通过 向下转型，使用强制类型转换符 => 调用子类 特有 的属性和方法
 * instanceof 的使用 a instanceof A 判断对象a 是否是类A的实例，如果是 返回 true；如果不是返回false
 *
 * 使用的情景：为了避免在向下转型中出现ClassCastException的异常，所以需要在进行向下转型之前，进行instanceof的判断
 *
 * a instanceof A 返回true a instanceof B 也返回true
 * 则B是A的父类
 *
 *
 */
        if (p instanceof Student) {
            Student s1 = (Student) p;
            s1.study();  //学生 特有 的学习
        }
    }

    public void func_PolymorphismTest(Animal_PolymorphismTest animal_polymorphismTest) {
        animal_polymorphismTest.eat();
    }

}


class Animal_PolymorphismTest {
    public void eat() {
        System.out.println("动物：进食");
    }
}

class dog_PolymorphismTest extends Animal_PolymorphismTest {
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
