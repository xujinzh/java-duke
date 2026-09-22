package xjava013polymorphism;

/**
 * 所谓多态，就是指一个引用（类型）在不同情况下的多种状态。
 * 多态是指通过指向父类的指针，来调用不同子类中的方法。
 * Polymorphism
 */

public class Polymorphism {
    public static void main(String[] args) {
        // Cat cat = new Cat();
        // cat.cry();
        // Dog dog = new Dog();
        // dog.cry();

        // // 多态: animal 对象会自动调用不同类的 cry 方法
        // Animal animal = new Cat();
        // animal.cry();

        // animal = new Dog();
        // animal.cry();

        // 多态
        Master master = new Master();
        master.feed(new Dog(), new BoneFood());

        master.feed(new Cat(), new FishFood());
    }
}

// 动物父类
class Animal {
    public int age;
    public String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // 该方法必须有，才能保障多态
    public void cry() {
        System.out.println("animal cry");
    }

    public void eat() {
        System.out.println("animal eat");
    }
}

class Cat extends Animal {
    // 如果子类没有覆盖父类的方法，那么多态情况下，会调用父类的方法
    public void cry() {
        System.out.println("cat cry");
    }

    public void eat() {
        System.out.println("cat eat");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("dog cry");
    }

    public void eat() {
        System.out.println("dog eat");
    }
}

// 食物，父类
class Food {
    String name;

    public void showFoodName() {

    }
}

class FishFood extends Food {
    public void showFoodName() {
        System.out.println("fish food");
    }
}

class BoneFood extends Food {
    public void showFoodName() {
        System.out.println("bone food");
    }
}

// 主人父类
class Master {
    // 给动物喂食物
    // 使用多态，方法就可以用一个
    public void feed(Animal animal, Food food) {
        animal.eat();
        food.showFoodName();
    }
}