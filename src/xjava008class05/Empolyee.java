package xjava008class05;

/**
 * 
 * Empolyee
 * 
 * 1. 之类最多只能继承一个父类（指直接继承）
 * 2. java 所有类都是 Object 类的子类
 * 3.
 */
public class Empolyee {
    public String name;
    protected float salary;
    int id;
    private String workContent;

    public Empolyee(String name, float salary, int id, String workContent) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.workContent = workContent;
    }

    public float getSalary() {
        return this.salary;
    }

    public String getWorkContent() {
        return this.workContent;
    }
}
