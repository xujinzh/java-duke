package xjava003class;

/* 
类和对象
构造方法
*/
public class Class {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 1;
        cat1.name = "xiaohua";
        cat1.color = "white";

        // 👇 关键：必须先 new 一个 Master 对象赋值给 cat1.master
        cat1.master = new Master();
        cat1.master.name = "mingpopo";

        System.out.println(cat1);

        Cat cat2;
        cat2 = cat1;

        System.out.println(cat2.age);

        cat2.name = "wangshang";
        System.out.println(cat1.name);

        cat1.speak();
        cat1.jiSuan();
        int result = cat1.jiSuan(100);
        System.out.println(result);

        cat1.add(1, 2);
        System.out.println(cat1.add2(1, 2));
    }
}

// 定义一个猫类
class Cat {
    int age;
    String name;
    String color;
    Master master;

    // 构造方法
    public Cat() {

    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "age: " + this.age + ", name: " + this.name + ", color: " + this.color + ", master name: " + master.name;
    }

    // 方法名的首字母是小写的，可以用驼峰法（匈牙利法），或者下划线法
    public void speak() {
        System.out.println("I am a good man");
    }

    public void jiSuan() {
        int result = 0;
        for (int i = 0; i <= 1000; i++) {
            result += i;
        }
        System.out.println(result);
    }

    // 方法重载
    public int jiSuan(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    public int add2(int num1, int num2) {
        return num1 + num2;
    }
}

class Master {
    int age;
    String name;
    String address;
}
