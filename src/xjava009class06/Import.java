package xjava009class06;
import xjava008class05.*;

public class Import {
    public static void main(String[] args) {
        Empolyee c = new Empolyee("Tony", 100_000.2f, 516, "moon");
        // 只有 public 修饰的类成员变量、类成员方法才可以别其他包调用
        System.out.println(c.name);
        System.out.println(c.getSalary());
        System.out.println(c.getWorkContent());
    }
}
