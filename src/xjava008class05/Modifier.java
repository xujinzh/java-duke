package xjava008class05;

/* 
java 提供四种访问控制修饰符来控制方法和变量的访问权限：
1. 公开级别：用 public 修饰，对外公开
2. 受保护级别：用 protected 修饰，对于子类和同一个包中的类公开
3. 默认级别：没有修饰符号，想同一个包的类公开
4. 私有级别：用 private 修饰，只有类本身可以访问，不对外公开

访问级别  访问控制修饰符  同类  同包  子类 不同包
公开      public         y     y     y    y
受保护    protected      y     y     y    n
默认      没有修饰符      y     y     n    n
私有      private        y     n     n    n

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