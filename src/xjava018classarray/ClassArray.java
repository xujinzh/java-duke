package xjava018classarray;

public class ClassArray {
    public static void main(String[] args) {
        // 定义狗数组
        Dog[] dogs = { new Dog("白白", 3.2f), new Dog("灰灰", 2.3f),
                new Dog("来福", 2.8f), new Dog("阿黄", 4.3f)
        };

        // 总体重
        float totalWeight = 0;
        for (int i = 0; i < dogs.length; i++) {
            totalWeight += dogs[i].weight;
        }
        System.out.println("总体重: " + totalWeight);

        // 平均体重
        float aveWeight = totalWeight / dogs.length;
        System.out.println("平均体重: " + aveWeight);
    }
}

class Dog {
    public String name;
    public float weight;

    public Dog(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    // public String getName() {
    // return this.name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public float getWeight() {
    // return this.weight;
    // }

    // public void setWeight(float weight) {
    // this.weight = weight;
    // }
}