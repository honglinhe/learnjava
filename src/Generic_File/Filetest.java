package Generic_File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Filetest {
    /**
     * 在hello.txt文件的目录下创建新的文件1.txt
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {
        File file = new File("/Users/hedada/Desktop/language/learnjava/src/Generic_File/hello.txt");
        File file1 = new File(file.getParent(), "1.txt");
        boolean newFile = file1.createNewFile();
        if (newFile){
            System.out.println("chenggong");
        }

    }
    /**
     * 判断指定目录下是否有后缀名为.png 的文件，如果有，就输出该文件名称
     */
    @Test
    public void test2(){
        File srcfile = new File("/Users/hedada/Desktop/language/learnjava/src/Generic_File/");
        String[] fileNames = srcfile.list();
        for (String fileName:fileNames){
            if (fileName.endsWith(".png")){
                System.out.println(fileName);
            }
        }
    }
    /**
     * 遍历指定目录下的所有文件名称，包括子文件目录下的文件
     * 拓展：并计算指定目录下占用空间的大小
     * 删除指定文件目录下及其下的所有文件
     */
    @Test
    public void test3(){
        File srcfile = new File("/Users/hedada/Desktop/language/learnjava/src/Generic_File/");
        printFile(srcfile);
        System.out.println(printlength(srcfile));
        File file = new File("/Users/hedada/Desktop/language/learnjava/src/Generic_File/1.txt");
        deletDirectory(file);
    }

    private void deletDirectory(File file) {
        if (file.isDirectory()){
            File[] all =file.listFiles();
            for (File f:all){
                deletDirectory(f);
            }
        }
        file.delete();
    }

    public static void printFile(File dir){
        File[] files3 = dir.listFiles();
        for (File file3:files3){
            if (file3.isDirectory()){
                printFile(file3);
            }else {
                System.out.println(file3.getName());
            }
        }
    }
    public long printlength(File dir){
        long size =0;
        if (dir.isFile()){
            size+=dir.length();
        }else {
            File[] all = dir.listFiles();
            for (File i:all){
                size+=printlength(i);
            }
        }
        return size;
    }

}
