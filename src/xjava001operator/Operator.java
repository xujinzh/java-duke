/* 
运算符操作
*/
package xjava001operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operator {

    public static void main(String[] args) {
        int a = 90;
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        int c = 90;
        int d = ++c;
        System.out.println(d);
        System.out.println(c);

        int x = 2;
        int y = 3;
        if (y % x == 0) {
            System.out.println("可以整除");
        } else {
            System.out.println("不能整除");
        }

        // 不定类型
        // int m = 3;
        // int n = ++((++m)--);
        // System.out.println(n);

        int k = 56;
        int l = 90;
        k -= 34;
        l %= k;
        System.out.println(l);
        System.out.println(k);

        // 从键盘接收2个数（整数或小数），比较2个数大小
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // give a prompt
            System.out.println("请输入第一个数：");
            // 从控制台读取一行数据
            String a1 = br.readLine();

            System.out.println("请输入第二个数：");
            String a2 = br.readLine();

            // convert String to float
            float num1 = Float.parseFloat(a1);
            float num2 = Float.parseFloat(a2);

            if (num1 > num2) {
                System.out.println("第一个大");
            }

            if (num1 == num2) {
                System.out.println("相等");
            }

            if (num1 < num2) {
                System.out.println("第二个大");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 逻辑运算符
        int w = 90;
        int s = 90;

        if (w == s || w > 8) {
            System.out.println("ok1");

        }

        s--;

        if (w > s && w > 45) {
            System.out.println("ok2");

        }

        if (!(w < s)) {
            System.out.println("ok3");
        }
    }

    public int add(int a, int b) {
        return a + b;
    }
}