package xjava007class04;

/* 
类变量：
1. 加上 static 成为类变量或静态变量，否则称为实例变量
2. 类变量是与类相关的，公共的属性
3. 实例变量属于每个对象个体的属性
4. 类变量可以通过"类名.类变量名"直接访问，非类变量不可以

类方法：
1. 类方法属于与类相关的，公共的方法
2. 实例方法属于每个对象个体的方法
3. 类方法可以通过"类名.类方法名"直接访问
*/
public class Class {
    public static void main(String[] args) {
        new Stu(18, "xiaoming", 10_000);
        // Stu s1 = new Stu(18, "xiaoming", 10_000);
        new Stu(18, "xiaohua", 10_000);
        // Stu s2 = new Stu(18, "xiaohua", 10_000);
        int totalFee = Stu.getTotalFee();
        System.out.println("total fee: " + totalFee);
    }
}


class Stu {
    int age;
    String name;
    int fee;
    // 静态变量、类变量
    static int totalFee;

    // 非静态方法可以访问静态变量和非静态变量
    // 静态变量是公共的，创建实例后，（实例的）非静态方法可以访问公共的静态变量
    public Stu(int age, String name, int fee) {
        this.age = age;
        this.name = name;
        totalFee+=fee;
    }

    // 静态方法、类方法
    // 不能访问非静态变量。因为，静态方法是不知道实例化的新对象的信息的
    // 当需要所有对象都共享使用的方法，定义为静态方法。如公共的计算函数
    public static int getTotalFee() {
        return totalFee;
    }
}
