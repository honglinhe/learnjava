package OOP2;

/**对比  Equals   学习
 *    public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *
 */
public class ToStringTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.toString());//OOP2.Person@23fc625e
        //重写后 = > Person{name='null', age=0, id='人的身份证号'}
        System.out.println(p1);//OOP2.Person@23fc625e

        String s1 = new String("111");
        System.out.println(s1);//111

    }


}
