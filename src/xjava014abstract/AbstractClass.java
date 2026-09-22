package xjava014abstract;

/**
 * 抽象类时 java 中一个比较重要的类
 * 1. 用 abstract 关键字修饰的类叫抽象类。抽象类不能实例化。
 * 2. 用 abstract 关键字修饰的类方法叫抽象方法。抽象方法不能有函数体，必须在子类中必须要实现。
 * 3. 子类继承抽象类时，抽象方法必须要覆盖实现。
 * 
 * 抽象类中可以有非抽象的方法。即该方法可以有函数体。
 * 
 * AbstractClass
 */
public class AbstractClass {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.cry();
    }
}

// 抽象类。父类方法的不确定性
abstract class Animal {
    String name;
    int age;

    // 抽象方法。不能有函数体
    abstract public void cry();

    // 非抽象方法。要有函数体
    public void printName() {
        System.out.println(this.name);
    }
}

/*
 * 当一个类继承抽象类时，子类需要把父类的抽象方法全部实现
 */
class Cat extends Animal {

    public void cry() {
        System.out.println("cat cry");
    }
}