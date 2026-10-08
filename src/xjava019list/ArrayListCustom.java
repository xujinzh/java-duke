package xjava019list;

import java.util.ArrayList;

public class ArrayListCustom {
    public static void main(String[] args) {
        // 定义 ArrayList 对象
        ArrayList<Object> al = new ArrayList<Object>();
        System.out.println("arrayList 大小：" + al.size());
        // 添加数据到列表末尾。数据类型是 Object 类
        al.add(new Clerk("xiaoming", 18, 32.3f));
        System.out.println("arrayList 大小：" + al.size());
        // 访问第一个对象
        Clerk c1 = (Clerk) al.get(0);
        System.out.println("c1's name is " + c1.getName());

    }
}

class Clerk {
    private String name;
    private int age;
    private float sal;

    public Clerk(String name, int age, float sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getSal() {
        return this.sal;
    }
}
