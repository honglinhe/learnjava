package Aggregate;

import org.junit.Test;

import java.util.*;

/**
 * 一、集合框架的概述
 *
 * 1.集合、数组都是对多个数据进行存储操作的结构，简称Java容器。
 *      说明:此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储
 *
 *  2.1 数组在存储多个数据方面的特点:
 *       一旦初始化以后，其长度就确定了。
 *      数组一旦定义好，其元素的类型也就确定了。我们也就只能操作指定类型的数据了。
 *
 *  2.2数组在存储多个数据方面的缺点:
 *      一旦初始化以后，其长度就不可修改。
 *      数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，同时效率不高。
 *      获取数组中实际元素的个数的需求，数组没有现成的属性或方法可用
 *      数组存储数据的特点:有序、可重复。对于无序、不可重复的需求，不能满足。
 */
public class CollectionTest {
    /**
     * 1.向TreeSet中添加的数据，要求是相同类的对象。
     * 2.两种排序方式:自然排序（实现Comparable接口）和定制排序（Comparator）
     *
     * 3.自然排序中，比较两个对象是否相同的标准为: compareTo（）返回e. 不再是equals（）.
     * 4.定制排序中，比较两个对象是否相同的标准为: compare（） 返回0.不再是equals（）.
     */

    @Test
    public void test3(){
        Comparator comparator = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }else {
                    throw new RuntimeException("错误");
                }
            }
        };

        TreeSet set = new TreeSet(comparator);
        set.add(new Person("a",1));
        set.add(new Person("b",10));
        set.add(new Person("d",4));
        set.add(new Person("c",9));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * void add(int index, Object ele):在index位置插入ele元素
     * boolean addALl(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
     * Object get(int index): 获取指定index位置的元素
     * int indexOf(Object obj): 返回obj在集合中首次出现的位置
     * int lastIndexOf(Object obj): 返回obj在当前集合中末次出现的位置
     * Object remove(int index):移除指定index位置的元素，并返回此元素
     * Object set(int index, Object ele): 设置指定index位置的元素为ele
     * list subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的[,)左闭右开子集合
     *
     * 总结:常用方法
     * 増: add(Object obj)
     * 册: remove(int index) /remove(Object obj)
     * 改: set(int index, Object ele)
     * 査: get(int index)
     * 插: add(int index, Object ele)
     * 长度: size()
     * 遍历:Iterator迭代器方式
     *      增强for循珎
     *      普通的循坏
     *
     */
    @Test
    public void Listtest(){


    }



    @Test
    public void methodtest1() {
        Collection collection = new ArrayList();
        //add（object e）: 将元素e添加到集合collection中
        collection.add("aaa");
        collection.add(111);
        //size（）:获取添加的元素的个数
        System.out.println(collection.size());
        Collection collection1 = new ArrayList();
        //addAll（Collection coll）: 将collection集合中的元素添加到当前的集合中
        collection.addAll(collection);
        //clear（）:清空集合元素
        collection.clear();
        //isEmpty（）:判断当前集合是否为空
        System.out.println(collection.isEmpty());

        // contains（object obj）:判断当前集合中是否包含obj
        // 我们在判断时会调用obj对象所在类的equals（）。
        collection.add(123);
        collection.add(new String("asd"));
        System.out.println(collection.contains(123));//true
        System.out.println(collection.contains(new String("asd")));//true
        // remove（Object obj）: 从当前集合中移除obj元素。
        collection.remove(123);
        System.out.println(collection);//[asd]
        //向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals（）.
        //removeALl（Collection coll1）:差集:从当前集合中移除collection1中所有的元素。
        //retainAll（Collection coll1）:交集: 获取当前集合和coll1集合的交集，并返回给当前集合
        //equals（Object obj）: 要想返回true，需要当前集合和形参集合的元素都相同，包括顺序。
        //hashCode（）:返回当前对象的哈希值
        System.out.println(collection.hashCode());//96913
        //toArray:集合-->数组
        Object[] objects = collection.toArray();
        //Arrays类的静态方法asList():数组-->集合
        List<Object> objects1 = Arrays.asList();
        //Iterator对象称为迭代器（设计模式的一种）， 主要用于遍历Collection 集合中的元素。
        collection.add(1);
        collection.add(2);
        collection.add(3);
        Iterator iterator = collection.iterator();
        //hasNext（）:判断是否还有下一个元素
        while (iterator.hasNext()){
            //next（）:①指针下移②将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }
        //for（集合元素的类型 局部变量:集合对象）
        // 内部仍然调用了迭代器。
        for (Object object:collection){
            System.out.println(object);
        }
    }

}
class Person{
    public String name;
    public int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
