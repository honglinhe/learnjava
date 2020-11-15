package OOP3;

/**
 * 1.接口使用 interface 来定义
 * <p>
 * 2.java中,接口和类是并列的两个结构
 * <p>
 * 3.如何定义接口:定义接口中的成员
 * <p>
 * 3.1 JDK7及以前:只能定义全局常量和抽象方法
 *      >全局常量:public static final的,但是书写时,可以省略不写
 *      >抽象方法:public abstract的
 * <p>
 * 3.2 JDK8:除了定义全局常量和抽象方法之外,还可以定义静态方法、默认方法(略)
 *      >
 * <p>
 * 4.接口中不能定义构造器的! --->意味着接口不可以实例化
 * <p>
 * 5.java开发中,接口通过让类去实现( implements)的方式来使用
 * 如果实现类覆盖了接口中的所有抽象方法,则此实现类就可以实例化
 * 如果实现类没有覆盖接口中所有的抽象方法,则此实现类仍为一个抽象类
 * <p>
 * 6.Java类可以实现多个接口
 * >弥补了Java单继承性的局限性
 * 格式:class AA extends BB implements CC,DD,EE
 * <p>
 * 7.接口与接口之间可以继承,而且可以多继承
 * ********************************************
 * <p>
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 2.接口,实际上就是定义了一种规范
 * 3.开发中,体会面向接口编程
 *
 *
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.min);
        Plane p1 = new Plane();
        p1.fly();

        Computer c1 = new Computer();

        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        c1.transferData(flash);

        //2、创建了接口的非匿名实现类的匿名对象
        c1.transferData(new Flash());

        //3、创建了接口的匿名实现类的非匿名对象
        USB u1 = new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };


        //4、创建了接口的匿名实现类的匿名对象
        c1.transferData(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });





        //测试代理模式
        Server s = new Server();
        ProxyServer ps = new ProxyServer(s);
        ps.browse();

    }

}


interface Flyable {
    //全局的变量
    public static final int max = 10;
    //可以省略public static final
    int min = 1;

    //抽象方法
    public abstract void fly();

    void stop();
}

interface Att {
    public abstract void attar();
}


interface aa {

}

interface bb {

}

interface cc extends aa {
    //可以继承
}

class Computer {
    public void transferData(USB usb) {
        usb.start();
        System.out.println("xiejie");
        usb.stop();
    }
}

interface USB {
    void start();

    void stop();

}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("kaishi");
    }

    @Override
    public void stop() {
        System.out.println("jiesu");
    }
}


class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("fei");
    }

    @Override
    public void stop() {
        System.out.println("ting");
    }
}

class bullt implements Att, Flyable {
    //可以链接多个接口
    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attar() {

    }
}


/**
 * 测试代理类
 */

interface Network {
    public abstract void browse();
}

class Server implements Network {

    @Override
    public void browse() {
        System.out.println("被代理类，真实的服务器访问网路");
    }
}

class ProxyServer implements Network {
    private Network network;

    public ProxyServer(Network network) {
        this.network = network;
    }

    public void check() {
        System.out.println("代理类，联网之前的操作");
    }

    @Override
    public void browse() {
        check();
        network.browse();
    }


}

