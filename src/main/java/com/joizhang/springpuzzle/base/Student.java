package com.joizhang.springpuzzle.base;

/**
 * @author joizhang
 */
public class Student extends BaseStudent {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Student(Integer id, String name, int age) {
        super(id);
        this.age = age;
        this.name = name;
    }

    public Student(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
