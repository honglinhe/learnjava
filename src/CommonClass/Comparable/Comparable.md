# Comparable接口
* Comparable接口的使用举例:  **自然排序**
 
* 1.像String、包装类等实现了Comparable接口，重写了compareTo（obj）方法，给出了比较两个对象大小的方式。
* 2.像String、包装类重写compareTo（）方法以后，进行了从小到大的排列
* 3..重写compareTo（obj） 的**规则**:
     * 如果当前对象this**大于**形参对象obj，则返回正整数，
     * 如果当前对象this**小于**形参对象obj，则返回负整数，
     * 如果当前对象this**等于**形参对象obj，则返回零。
* 4.对于自定义类来说，如果需要排序，我们可以让自定义类**实现**Comparable接口，**重写**compareTo(obj)方法
## 相关代码

```
@Test
public void test1() {
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("aaa", 23);
        goods[1] = new Goods("bbb", 3);
        goods[2] = new Goods("ccc", 243);
        goods[3] = new Goods("ddd", 54);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }
    
//实现Comparable接口
class Goods implements Comparable {
    private String name;
    private double p;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", p=" + p +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public Goods(String name, double p) {
        this.name = name;
        this.p = p;
    }

    public Goods() {
    }

//重写compareTo(obj)方法
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            return Double.compare(this.p, goods.p);
        }
        throw new RuntimeException("error");
    }

}

```

# Comparator

* Comparator接口的使用: 定制排序

* 1.**背景**:
     * 当元素的类型没有实现java. lang. Comparable接口而又不方便修改代码，
     * 或者实现了java. lang. Comparable接口的排序规则不适合当前的操作，
     * 那么可以考虑使用Comparator的对象来排序
* 2.**重写**compare（Object o1， Object o2）方法，比较o1和o2的大小:
     * 如果o1**大于**o2，返回正整数；
     * 如果o1 **小于**o2，返回负整数。
     * 如果**相等**，则返回0；
          
## 相关代码

```
    @Test
    public void test2() {
        String[] strings = new String[]{"a", "c", "f", "h", "m"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                }
                throw new RuntimeException("error");
            }
        });
        System.out.println(Arrays.toString(strings));
    }
```
# Comparable接口与Comparator的使用的对比
 *      Comparable接口的方式一旦确定，保证Comparable接口实现类的对象在任何位置都可以比较大小
 *      Comparator接口属于临时性的比较。
