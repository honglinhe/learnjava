package Multithreading;

public class Singleton_fuxi {
}


/**
 * 所谓类的单例设计模式,
 * 就是采取一定的方法保证在整个的软件系统中,对某个类只能存在一个对象实例。
 * 分为懒汉式和饿汉式
 *
 * 饿汉式式一开始就创建了一个对象
 */


/**
 * 饿汉式
 */
class EH{
    private EH(){

    }

    private static EH eh = new EH();

    public static EH getEh() {
        return eh;
    }
}

/**
 * 懒汉式
 * 懒汉式就是一开始不新建一个对象
 */
class LH{
    private LH(){

    }
    private static LH lh = null;

    public static LH getBh() {
        if (lh==null){
            lh = new LH();
        }
        return lh;
    }
}