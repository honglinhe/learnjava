// public class shuzu {
//     public static void main(String[] args) {
//         int[] i;
//         i = new int[] { 100, 12, 123, 4234, 2432 };
//         int[] a = new int[3];
//         int[][] m = new int[][] { { 23 }, { 324 }, { 433 } };
//         int[][] e = new int[23][3];
//     }
// }
/*
 * 数组的默认的初始值： int：0； char:0或‘\u0000’,而非‘0’ duble:0.0 boolean:false 引用类型：null
 */

//数组的算法
import java.util.Arrays;

public class shuzu {
    public static void main(String[] args) {
        // 1.定义一个一维的数组，包含10个元素，其为随机生成的两位数，求最大值
        // 随机生成两位数的公式：(int)(Math.random()*(b-a+1)+a);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("最大值" + max);
        // 2.复制数组
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            // System.out.println(a[i]);
            System.out.println(b[i]);
        }
        System.out.println("*************");
        // 3.反转
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;

        }
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }
        // 4.二分查找(前提是有序)
        int[] m = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 543, 567 };
        int text = 4;
        int head = 0;
        int end = m.length - 1;
        boolean flag = true;

        while (head < end) {
            int middle = (end + head) / 2;
            if (m[middle] == text) {
                System.out.println(middle + "zhoadaole");
                System.out.println("!!!!!!!!!!!!!");
                flag = false;
                break;
            } else if (m[middle] < text) {
                head = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (flag) {
            System.out.println("no");
        }

        // 5.冒泡排序
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp1 = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp1;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // 6.Arrays
        boolean q = Arrays.equals(a, b);
        System.out.println(q);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 5);
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}

/*
 * import java.util.Arrays;
 * 
 * 
 * 
 * 
 * boolean equals(int[] a,int[] b) 判断两个数组是否相等； String toString(int[] a) 输出数组信息；
 * void fill(int[] a,int val) 将指定值填充到数组之中； int binarySearch(int[] a,int key)
 * 对排序后的数组进行二分法检索指定的值；
 */