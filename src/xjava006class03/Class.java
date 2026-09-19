package xjava006class03;

public class Class {
    static int i = 1;
    // 只会执行一次。在构建类的过程中就会触发。跟创建示例或对象没关系
    // 存储在代码区
    static {
        System.out.println("static 静态代码块");
        i++;
    }

    // 对象创建时都会执行
    public Class() {
        System.out.println("构造函数");
        i++;
    }

    public static void main(String[] args) {
        Class c1 = new Class();
        System.out.println(Class.i);

        Class c2 = new Class();
        System.out.println(Class.i);
    }
}
