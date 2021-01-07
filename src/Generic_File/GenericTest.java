package Generic_File;

import org.junit.Test;

import java.util.*;

public class GenericTest {
//    @Test
//    public void test1(){
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(11);
//        integers.add(22);
//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()){
//            Integer next = iterator.next();
//            System.out.println(next);
//        }
//
//    }
//    public <T>void show(T t){
//        System.out.println(t);
//    }

//    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        test2(integers);
//        /**
//         * List集合装载的是String，在编译时期就报错了
//         */
////        ArrayList<String> strings = new ArrayList<>();
////        test2(strings);
//    }
//    public static void test2(List<? extends Number>list){
//
//    }

    /**
     * 使用泛型方法打印不同类型的数组元素：
     *
     * @param inputArray
     * @param <E>
     */
//    public static <E> void printArray(E[] inputArray) {
//        for (E e : inputArray) {
//            System.out.println(e);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Integer[] intArray = {1, 2, 3, 4};
//        printArray(intArray);
//    }
    /**
     * 下面的例子演示了"extends"如何使用在一般意义上的意思"extends"（类）
     * 或者"implements"（接口）。
     * 该例子中的泛型方法返回三个可比较对象的最大值。
     */
//
//    public static <T extends Comparable<T>> void maximin(T x,T y,T z){
//        T max = x;
//        if (y.compareTo(max)>0){
//            max = y;
//        }
//        if (z.compareTo(max)>0){
//            max = z;
//        }
//        System.out.println(max);
//    }
//
//
//    public static void main(String[] args) {
//        maximin(2,534,6);
//    }
    /**
     * 类型通配符一般是使用?代替具体的类型参数。例如 List<?>
     *     在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类。
     */
//    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("111");
////        getData(strings);
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(11);
//        getData(integers);
//    }
//    public static void getData(List<? extends Number> data){
//        System.out.println(data.get(0));
//    }

    /**
     * 分别遍历 key values 和key-->values
     */
    @Test
    public void test3(){
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("a",1);
        stringIntegerHashMap.put("b",2);
        stringIntegerHashMap.put("c",3);
        Set<String> strings = stringIntegerHashMap.keySet();
        for (String string:strings){
            System.out.println(string);
        }
        Collection<Integer> values = stringIntegerHashMap.values();
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set<Map.Entry<String, Integer>> entries = stringIntegerHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"--->"+value);
        }
        List<String> lists= getValueList(stringIntegerHashMap);
        System.out.println(lists);
    }

    private List<String> getValueList(HashMap<String, Integer> stringIntegerHashMap) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collection<String> values = stringIntegerHashMap.keySet();
        for (String s:values){
            arrayList.add(s);
        }
        return arrayList;

    }


}

