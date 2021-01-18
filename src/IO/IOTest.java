package IO;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IOTest {
//    public static void main(String[] args) {
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("1.txt"));
//
//
//
//    }

    /**
     * 文件的加密
     */
    @Test
    public void test1() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("/Users/hedada/Desktop/language/learnjava/src/IO/1.txt");
            fileOutputStream = new FileOutputStream("/Users/hedada/Desktop/language/learnjava/src/IO/1s.txt");
            byte[] bytes = new byte[20];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                for (int i = 0; i < len; i++) {
                    bytes[i] = (byte) (bytes[i] ^ 5);
                }
                fileOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    /**
     * 获取文本上字符出现的次数，把数据写入文件中
     */

    @Test
    public void test2() {
        FileReader fileReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            fileReader = new FileReader("src/IO/2.txt");
            int len;
            while ((len = fileReader.read()) != -1) {
                char c = (char) len;
                if (hashMap.get(c) == null) {
                    hashMap.put(c, 1);
                } else {
                    hashMap.put(c, hashMap.get(c) + 1);
                }

            }
            bufferedWriter = new BufferedWriter(new FileWriter("src/IO/2w.txt"));
            Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
            for (Map.Entry<Character, Integer> entries1 : entries) {
                switch (entries1.getKey()) {
                    case ' ':
                        bufferedWriter.write("空格" + entries1.getValue());
                        break;
                    case '\t':
                        bufferedWriter.write("tab" + entries1.getValue());
                        break;
                    case '\r':
                        bufferedWriter.write("回车" + entries1.getValue());
                        break;
                    case '\n':
                        bufferedWriter.write("换行" + entries1.getValue());
                        break;
                    default:
                        bufferedWriter.write(entries1.getKey() + "-->" + entries1.getValue());
                        break;
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (bufferedWriter != null) {

                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 使用缓冲流实现文件的复制操作
     */
    @Test
    public void test3() {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("src/IO/1.txt"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("1c.txt"));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {

                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
