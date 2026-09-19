package xjava004class01;

public class Class01 {
    public static void main(String[] args) {
        Dog dog = new Dog(1, "大黄");
        dog.showInfo();
        Person p1 = new Person(dog, 23, "搜狗");
        p1.showInfo();

    }
}

class Person {
    int age;
    String name;
    Dog dog;

    public Person(Dog dog, int age, String name) {
        this.dog = dog;
        this.age = age;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Person name: " + this.name);
    }
}

class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void showInfo(){
        System.out.println("Dog name: " + this.name);
    }
}
