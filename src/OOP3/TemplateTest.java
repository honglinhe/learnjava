package OOP3;

import java.awt.*;

/**
 * 模版的设计模式与应用的场景
 */
public class TemplateTest {
    public static void main(String[] args) {
        SubTemplate s1 = new SubTemplate();
        s1.Time();
    }
}


abstract class Template {
    //计算某段代码执行所需要花费的时间
    public void Time() {
        long start = System.currentTimeMillis();
        this.code();//不确定的部分、易变的部分
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为" + (end - start));
    }
    public abstract void code();
}


class SubTemplate extends Template{

    @Override
    public void code() {
        int sum =0;
        for (int i = 0;i<10000;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}