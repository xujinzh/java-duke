package xjava011overloadOverride;
/**
 * 
 * Over
 * 
 * 方法重载
 * 1. 方法名相同
 * 2. 方法的参数类型、个数、顺序至少有一项不同
 * 3. 方法返回类型可以不同
 * 4. 方法的修饰符可以不同
 * 
 * 只有返回类型不一样，不能构成方法重载
 */

/**
 * 
 * Over
 * 
 * 方法覆盖就是子类有一个方法，和父类的某个方法的返回值、函数名、参数一样，
 * 那么我们就说子类的这个方法覆盖了父类的方法。
 * 
 * 注意，不包含访问修饰符。但是子类的方法的访问修饰符不能比父类的更严格，可以更公开。
 */
public class Over {
    public static void main(String[] args) {
        // 方法重载 overload
        Abc abc = new Abc();
        System.out.println(abc.getMax(3, 5));
        System.out.println(abc.getMax(3.3f, 5.5f));

        System.out.printf("\033[0;31m%s\033[0m%n", "=".repeat(66));

        // 方法覆盖 override
        Abc a = new Abc();
        System.out.println(a.Add(1));
        Bcd b = new Bcd();
        System.out.println(b.Add(1));
        Cde c = new Cde();
        System.out.println(c.Add(1));
    }
}

class Abc {
    public int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public float getMax(float a, float b) {
        return a > b ? a : b;
    }

    protected int Add(int a) {
        return a + 1;
    }
}

class Bcd extends Abc {
    protected int Add(int a) {
        return a + 2;
    }
}

class Cde extends Abc {
    // 至少为 protected
    public int Add(int a) {
        return a + 3;
    }
}