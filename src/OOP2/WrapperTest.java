package OOP2;

/**
 * 包装类的使用
 */
public class WrapperTest {
    public static void main(String[] args) {

        //基本的数据类型---> 包装类
        int n = 10;
        Integer N = new Integer(n);//10
        System.out.println(N);
        Order1 order = new Order1();
        System.out.println(order.b);//false
        System.out.println(order.B);//null


        //包装类--->基本数据类型
        Integer I = new Integer(12);
        int i = I.intValue();
        System.out.println(i + 2);

        //自动装箱
        int n1 = 10;
        Integer N1 = n1;

        //自动拆箱
        n1 = N1;
        /**
         * 基本数据类型、包装类--->String
         * 1、连接运算
         * 2、调用String的valueOf
         */
        int n2 = 10;
        String str1 = n2 + "";
        String str2 = String.valueOf(n1);
        System.out.println(str1);
        System.out.println(str2);

        //String--->基本数据类型、包装类
        String str3 = "423423";
        int n3 = Integer.parseInt(str3);
        System.out.println(n3+3);


    }
}

class Order1 {
    boolean b;
    Boolean B;
}