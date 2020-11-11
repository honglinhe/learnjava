package OOP2;

/**
 * 一、 == 的含义
 *  比较基本数据类型的时候：比较两个变量保存的数据是否相等
 *  比较引用数据类型的时候；比较两个对象的地址值是否相同
 *
 * 二、 equals() 方法
 *  1、只适用于引用的数据类型
 *  2、Object类中的 equals 定义 和 ==的作用是相同的
 *      public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 *  3、像String、Date、File、包装类等都重写了Object中的equals()方法，
 *  此时比较的就是"实体内容"是否相同
 *
 */
public class EqualsTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.equals(p2));//false   /重写equals后 => 为true

        String s1 = new String();
        String s2 = new String();
        System.out.println(s1.equals(s2));//true
    }

}
