package xjava008class05;

/* 
java 提供四种访问控制修饰符来控制方法和变量的访问权限：
1. 公开级别：用 public 修饰，对外公开
2. 受保护级别：用 protected 修饰，对于子类和同一个包中的类公开。不同包的子类也可以继承。
3. 默认级别：没有修饰符号，相同包的类公开。同一个包的子类可以继承。
4. 私有级别：用 private 修饰，只有类本身可以访问，不对外公开

访问级别  访问控制修饰符  同类  同包  同包子类 不同包子类 不同包
公开      public         y     y     y      y          y
受保护    protected      y     y     y      y          n
默认      没有修饰符      y     y     y      n          n
私有      private        y     n     n      n          n

*/

/**
 * 在 Java 中，没有访问修饰符（默认权限/包私有）和 protected 修饰的类成员属性，都可以被子类继承，
 * 但它们对子类的可见性（能否直接访问）取决于子类所在的包（Package）。
 * 
 * 更准确地说，能否继承并直接访问的规则如下：
 * 1. protected 修饰的属性可以被所有子类继承。
 * 无论子类是在同一个包下，还是在不同的包下，子类都可以继承并直接访问父类的 protected 属性。
 * 
 * 2. 没有访问修饰符（Default / Package-private）的属性
 * 只能被“同包”的子类继承。
 * 如果子类和父类在同一个包中，子类可以继承并直接访问该属性。
 * 如果子类和父类在不同的包中，子类无法继承也无法直接访问该属性（在子类眼里这个属性是不可见的）。
 * 
 * 🧱 直接对比表
 * 属性修饰符          同包的子类            跨包（不同包）的子类
 * protected          继承 🟢 (可直接访问)  继承 🟢 (可直接访问)
 * 无修饰符 (Default)  继承 🟢 (可直接访问)  不继承 ❌ (不可见)
 * Modifier
 */


public class Modifier {
    public static void main(String[] args) {
        Clerk xiaoming = new Clerk("xiaoming", 22, 10_000.56f);
        System.out.printf("\033[0;31m-%s-\033[0m%n", "=".repeat(66));
        System.out.println("name is " + xiaoming.name);
        System.out.println("salary is " + xiaoming.getSalary() + "RMB");
    }
}


class Clerk{
    public String name;
    // private修饰符只能在类内部被访问
    private int age;
    private float salary;

    public Clerk(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // 通过一个成员方法去访问私有属性
    public float getSalary() {
        return this.salary;
    }
}