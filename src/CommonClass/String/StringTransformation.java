package CommonClass.String;

import org.junit.Test;

import java.util.Arrays;

public class StringTransformation {

    /**
     * String 一> byte[]: 调用String 的getBytes()
     * byte[] 一> String: 调用String 的构造器
     */
    @Test
    public void test2() {
        String s = "abc123";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));//[97, 98, 99, 49, 50, 51]
        String s1 = new String(bytes);
        System.out.println(s1);//abc123
    }


    /**
     * String 一> char[]: 调用String 的toCharArray()
     * char[] 一> String: 调用String 的构造器
     */
    @Test
    public void test1() {
        String s1 = "123asd";
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);//123asd
        }
        char[] chars1 = new char[]{'s', 'a', 'c'};
        String s2 = new String(chars1);
        System.out.println(s2);//sac
    }
}
