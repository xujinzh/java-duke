package xjava005class02;

public class Class {
    public static void main(String[] args) {

        Child child1 = new Child(2, "tuantuan");
        child1.joinGame();

        Child child2 = new Child(2, "tiantian");
        child2.joinGame();

        System.out.println("共有" + Child.total + "个小朋友加入游戏");
    }
}

class Child {
    int age;
    String name;
    static int total;

    public Child(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void joinGame() {
        total++;
        System.out.println(this.name + "加入游戏");
    }
}
