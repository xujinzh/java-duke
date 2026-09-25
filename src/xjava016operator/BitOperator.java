package xjava016operator;

/* 
 java 打印时，以补码形式打印
*/

public class BitOperator {
    public static void main(String[] args) {
        // 整数转为二进制字符串
        int x = 2;

        String xStr = Integer.toBinaryString(x);
        xStr = String.format("%32s", xStr).replace(' ', '0');
        System.out.println(xStr);

        int y = 3;
        String yStr = Integer.toBinaryString(y);
        yStr = String.format("%32s", yStr).replace(' ', '0');
        System.out.println(yStr);

        // 位运算 bitwise operator
        int z = x & y;
        String zStr = Integer.toBinaryString(z);
        zStr = String.format("%32s", zStr).replace(' ', '0');
        System.out.printf("%s & %s = %s%n", xStr, yStr, zStr);

        int w = x | y;
        String wStr = Integer.toBinaryString(w);
        wStr = String.format("%32s", wStr).replace(' ', '0');
        System.out.printf("%s | %s = %s%n", xStr, yStr, wStr);

        int u = x ^ y;
        String uStr = Integer.toBinaryString(u);
        uStr = String.format("%32s", uStr).replace(' ', '0');
        System.out.printf("%s ^ %s = %s%n", xStr, yStr, uStr);

        int v = ~x;
        String vStr = Integer.toBinaryString(v);
        vStr = String.format("%32s", vStr).replace(' ', '0');
        System.out.printf("~%s = %s%n", xStr, vStr);
        System.out.println("v=" + v);

        // 位移运算 bit-shifting operator
        String xLeftShiftStr = Integer.toBinaryString(x << 2);
        xLeftShiftStr = String.format("%32s", xLeftShiftStr).replace(' ', '0');
        System.out.printf("%s << 2 = %s%n", xStr, xLeftShiftStr);
        System.out.printf("%d<<2=%d%n", x, (x << 2));

        String xRightShiftStr = Integer.toBinaryString(x >> 2);
        xRightShiftStr = String.format("%32s", xRightShiftStr).replace(' ', '0');
        System.out.printf("%s >> 2 = %s%n", xStr, xRightShiftStr);
        System.out.printf("%d>>2=%d%n", x, (x >> 2));

        String vLeftShiftStr = Integer.toBinaryString(v << 2);
        vLeftShiftStr = String.format("%32s", vLeftShiftStr).replace(' ', '0');
        System.out.printf("%s << 2 = %s%n", vStr, vLeftShiftStr);
        System.out.printf("%d<<2=%d%n", v, (v << 2));

        String vRightShiftStr = Integer.toBinaryString(v >> 2);
        vRightShiftStr = String.format("%32s", vRightShiftStr).replace(' ', '0');
        System.out.printf("%s >> 2 = %s%n", vStr, vRightShiftStr);
        System.out.printf("%d>>2=%d%n", v, (v >> 2));
    }
}
