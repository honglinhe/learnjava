package OOP3;




public interface JDK8 {
    //静态方法
    public static void method1(){
        System.out.println("1");
    }
    //默认方法
   public default void method2(){
        System.out.println("2");
    }
    public default void method3(){
        System.out.println("interface-method3");
    }


}
