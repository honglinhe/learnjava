package 异常处理;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 一、异常的处理:抓抛模型
 * <p>
 * 过程一:"抛":程序在正常执行的过程中,一旦出现异常,就会在异常代码处生成一个对应异常类的对象。
 * 并将此对象抛出。
 * 一旦抛出对象以后,其后的代码就不再执行。
 *
 * 关于异常对象的产生:
 * 1、系统自动生成的异常对象
 * 2、手动的生成一个异常对象,并抛出(throw)
 * <p>
 * 过程二:"抓”:可以理解为异常的处理方式:1、try-catch-finally  2、throws
 * <p>
 * 二、try-catch-finally的使用
 * try{
 * //可能出现异常的代码
 * } catch(异常类型1  变量名1){
 * //处理异常的方式1
 * } catch(异常类型2  变量名2){
 * //处理异常的方式2
 * } catch(异常类型3  变量名3){
 * //处理异常的方式3
 * }
 * <p>
 * finally{
 * //一定会执行的代码
 * }
 * <p>
 * 说明
 * 1.finally是可选的。
 * 2.使用try将可能出现异常代码包装起来,在执行过程中,一旦出现异常,就会生成一个对应异常类的对象,根据此对象
 * 的类型,去catch中进行匹配
 * 3.一旦try中的异常对家匹配到某一个 catch 时,就进入 catch 中进行异常的处理。一旦处理完成,就跳出当前的
 * try-catch结构(在没有写finally的情况)。继绩执行其后的代码
 * 4. catch中的异常类型如果没有子父类关系,则谁声明在上,谁声明在下无所谓。
 * catch中的异常类型如果满足子父类关系, 则要求子类一定声明在父类的上面。否则,报错
 * 5.常用的异常对象处理的方式 1、String getMessage() printStackTrace()
 *
 * 6.finally中声明的是一定会被执行的代码。即使catch中又出现异常了,try中有 return语句, catch中有return语句等情况。
 * 7.像数据库连接、输入输出流、网络编程、Socket等资源,JVM是不能自动的回收的,我们需要自己手动的进行资源的
 * 释放此时的资源释放,就需更声明在finally中.
 * 8.在try结构中声明的变量,再出了try结构以后,就不能再被调用
 * 9.try- catch-finally结构可以嵌套
 *
 *
 * 注意：ddd使用try- catch-finally处理编译时异常,是得程序在編译时就不再报错,但是运行时仍可能报错。
 * 相当于我们使用try- catch-finally将ー个编译时可能出现的异常,延到运行时出现
 */

public class TryCatchFinally {
    public static void main(String[] args) {
        Exception1 e = new Exception1();
        e.test();
//        e.finalil1();
        int n = e.finally2();
        System.out.println(n);
    }
}

class Exception1 {
    public void test() {

//        NumberFormatException
        String s = "aa";
        try {
            int n = Integer.parseInt(s);
            System.out.println("1");
        } catch (NumberFormatException e) {
//            System.out.println("出现数据转化的异常了");

//            String getMessage()
//            System.out.println(e.getMessage());

//            printStackTrace()
            e.printStackTrace();
        } catch (NullPointerException e) {

            System.out.println("出现空指针的异常了");
        }

        System.out.println("2");
    }

    /**
     * 测试finally
     */
//    public void finalil1() {
//        String s1 = "aaa";
//        try {
//            int n1 = Integer.parseInt(s1);
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            int[] arr = new int[10];
//            System.out.println(arr[10]);
//        }
////        System.out.println("f2");
//        finally {
//            System.out.println("f2");
//        }
//    }

    public int finally2() {
        try{
            int[] arr1 = new int[10];
            System.out.println(arr1[10]);
            return 3;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 4;
        }
        finally {
            System.out.println("f3");
        }
    }

    public void finally3(){
        FileInputStream fis = null;
        try {
            File file = new File("1.txt");
             fis =new FileInputStream(file);

            int data =fis.read();
            while ( data != -1){
                System.out.println((char)data);
                data = fis.read();

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}