package xjava002branch;

import xjava001operator.*;

/* 
分支，流程控制
*/

public class Branch {
    public static void main(String[] args) {
        int a = 121;
        if (a > 18) {
            System.out.println("a > 18");
        } else if (a > 8) {
            System.out.println("a > 8");

        } else if (a > 7) {
            System.out.println("a > 7");
        } else {
            System.out.println("a <= 7");
        }

        // switch 中可用数据类型主要有 byte, short, int, char, enum etc.
        // 条件表达式的数据类型要和 case 后的常量类型保持一致
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            default:
                System.out.println("o");
                break;
        }

        // 必须使用 new 实例化类对象
        // 前面导入时已经指定了包名，可以不用再写包名，直接用类名
        Operator ope = new Operator();

        int result = ope.add(3, 5);

        System.out.println("3 + 5 = " + result);

        // 循环控制
        for (int i = 0; i < 10; i++) {
            System.out.println("for: " + i);
        }

        // while 循环
        int i = 0;
        while (i < 10) {
            System.out.println("hi: " + i);
            i++;
        }

        // do while 循环
        int j = 0;
        do {
            System.out.println("do: " + j);
            j++;
        } while (j < 10);

        // 打印三角
        for (int k = 0; k < 10; k++) {
            if (k % 2 == 0) {
                continue;
            }
            for (int m = 0; m < (10 - k) / 2; m++) {
                System.out.print(" ");
            }
            for (int l = 10 - k; l < 10; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // int layer = 7;
        // for (int x = 1; x <= layer; x++) {
        // for (int w = 1; w <= layer - x; w++) {
        // System.out.print(" ");
        // }

        // for (int y = 1; y <= (x - 1) * 2 + 1; y++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // 镂空
        int layer = 7;
        for (int x = 1; x <= layer; x++) {
            for (int w = 1; w <= layer - x; w++) {
                System.out.print(" ");
            }

            for (int y = 1; y <= (x - 1) * 2 + 1; y++) {
                if (x == 1 || x == layer) {

                    System.out.print("*");
                } else {
                    if (y == 1 || y == (x - 1) * 2 + 1) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}