package Aggregate;

import org.junit.Test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class MapTest {
    @Test
    public void test1(){
        HashMap hashMap = new HashMap();
        hashMap.put("a",111);
        hashMap.put("b",222);
        hashMap.put("c",333);
        Set keySet = hashMap.keySet();
        Iterator iterator = keySet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()){
            Object key = iterator.next();
            Object value = hashMap.get(key);
            System.out.println((key + "--->" + value));


        }
    }
    @Test
    public void test2()  {
    }
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("jad.properties");
        properties.load(fileInputStream);
        String name = properties.getProperty("name");
        System.out.println(name);
    }

}

