package OOP2;

import java.util.Objects;

public class Person {
    String name;
    int age;
//    int id;
    String id = "人的身份证号";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(){

        System.out.println("人 父类 的走路");
    }

/**
 * 重写 equals
  */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age &&
//                Objects.equals(name, person.name) &&
//                Objects.equals(id, person.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, id);
//    }

/**
 * 重写 ToString
  */

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", id='" + id + '\'' +
//                '}';
//    }
}
