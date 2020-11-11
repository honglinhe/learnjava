package OOP2;

public class Student extends Person{
//    String name;
//    int age;
    //因为extends 所以不用再重新定义。
    String id = "学生学号";
    public Student() {
    }

    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
        super(name, age);

    }

//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
@java.lang.Override
    public void eat(){
        System.out.println("吃西瓜");
    }
    public void show (){
        System.out.println(this.id);
        System.out.println(super.id);
    }
    public void show_name_age(){
        System.out.println(name);
        System.out.println(age);
    }
@java.lang.Override
    public void walk(){

    System.out.println("学生 子类 的走路");
}
    public void study(){
        System.out.println("学生 特有 的学习");

    }



}
