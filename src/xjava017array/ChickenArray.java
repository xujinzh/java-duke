package xjava017array;

public class ChickenArray {
    public static void main(String[] args) {
        // 定义一个鸡数组，记录每只鸡的体重

        // 单独给每只鸡指定体重 
        // float[] chickens = new float[6];
        // // 分别对每只鸡的体重进行记录
        // chickens[0] = 3;
        // chickens[1] = 5;
        // chickens[2] = 1;
        // chickens[3] = 3.4f;
        // chickens[4] = 2;
        // chickens[5] = 50;

        // 同时给每只鸡指定体重
        float[] chickens = {3, 5, 1, 3.4f, 2, 50};
        // 总体重
        float totalWeight = 0;
        for (int i = 0; i <= chickens.length - 1; i++) {
            totalWeight += chickens[i];
        }
        System.out.println("总体重: " + totalWeight);

        // 平均体重
        float aveWeight = 0;
        aveWeight = totalWeight / chickens.length;
        System.out.println("平均体重: " + aveWeight);

    }
}
