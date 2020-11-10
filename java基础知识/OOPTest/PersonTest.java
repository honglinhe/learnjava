package OOPTest;

/*
1.属性=成员变量=field=域、字段
方法=成员方法=函数=method
创建类的对象=类的实例海=实例化类

2.方法的重载
在一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不一致就行
跟方法的权限修饰符、返回值的类型、形参变量名、方法体都没有关系

3.值传递的机制
如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
如果参数是引用数据类型，此时实参赋给形参的是实参真实存储的地址值

4.内存图
内存结构：栈（局部变量）  堆（new 出来的结构：对象（非static成员变量）、数组）
*/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "tom";
        System.out.println(p1.name);
        p1.eat("mmmm");
        new Person().name = "sam";// 匿名的对象
        Person p2 = new Person();
        p2.showkebianxingcan("sda", "dad", "dasdas", "sdgre");
        System.out.println("***************值传递********");
        Data data = new Data();
        data.m = 10;
        data.n = 20;

        System.out.println("m:" + data.m + "n:" + data.n);

        PersonTest test = new PersonTest();
        data.swap(data);
        System.out.println("m:" + data.m + "n:" + data.n);

    }

}

class Person {
    String name;

    public void eat(String a) {
        System.out.println("我爱吃饭" + a);
    }

    public void showkebianxingcan(String... strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }// 可变个数形参格式： 数据类型 ... 变量名，且可变形参必要在末尾，只能有一个
}

class Data {
    int m;
    int n;

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
