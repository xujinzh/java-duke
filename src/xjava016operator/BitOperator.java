package xjava016operator;

/* 
 java 打印时，以补码形式打印

 java 中没有无符号数。

 类型提升：Java 在对 byte、short、char 等低于 32 位的类型进行移位时，会先自动将其提升为 int 类型再移位。
 移动位数取模：如果要移位的对象是 int（32位），那么 >>> 32 相当于没移位，>>> 33 相当于 >>> 1（即移动位数会自动对 32 取模）。

 >>> 是“无符号右移运算符”
 无论该数是正数还是负数，右移后高位（最左边空出来的位）一律补 0
 

 在 Java 中，`>>>` 是**无符号右移运算符**（Unsigned Right Shift Operator）。它专门用来将一个数值的二进制位向右移动指定的位数。

它的核心特点是：**无论该数是正数还是负数，右移后高位（最左边空出来的位）一律补 `0`**。

把 `>>>`  和常见的 `>>`（带符号右移）做个直观对比：

| 运算符 | 名称 | 移动后的高位补什么？ | 适用场景 |
| :--- | :--- | :--- | :--- |
| **`>>`** | 带符号右移 | **保持原符号位**（正数补 `0`，负数补 `1`） | 常用于数学除以 2 的基本运算 |
| **`>>>`** | 无符号右移 | **一律补 `0`** | 常用于位掩码、哈希算法、图形处理等纯二进制操作 |


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
