package xjava015interface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 1. 接口不能被实例化
 * 2. 接口中所有非(default, static)方法都不能有主体。区别于抽象方法
 * 在 Java 8 之后，接口中可以引入 default（默认方法） 和 static（静态方法），这两类方法必须有方法体。
 * 3. 一个类可以实现多个接口
 * 4. 接口中可以有变量，但变量不能用 private、protected 修饰
 * --> a. 接口中的变量本质都是 static、final 的，不管加不加 static 修饰。必须初始化。
 * --> b. 在 java 开发中，经常把常用的变量定义在接口中，作为全局变量使用。访问形式：接口名.变量名
 * --> c. 接口中的变量默认且强制是 public static final 的
 * 5. 接口不能继承其他类，但可以继承其他接口
 * 6. 接口不能继承类
 * 
 * 类与类之间、接口与接口之间用 extends（单继承/多继承）；类与接口之间用 implements（多实现）
 * 类只能单继承，但接口可以多继承（例如：interface A extends B, C {} 是合法的）
 * 
 * USBInterface
 */
public class USBInterface {

    public static void main(String[] args) {
        // 创建电脑实例
        Computer computer = new Computer();
        // 电脑通过 usb 调用手机
        computer.useUsb(new Phone());
        // 电脑通过 usb 调用照相机
        computer.useUsb(new Camera());

        // 使用接口中定义的静态变量
        System.out.println(Hdmi.name);

        // 使用接口中定义的静态方法
        Usb.printGenerateDate();
    }
}

// hdmi 接口
interface Hdmi {
    /*
     * 接口中的变量默认且强制是 public static final 的。
     * 这意味着即使你只写 String name = "hdmi";
     * 编译器也会自动把它变成公有、静态、常量。因此，它无法被子类或实现类修改。
     */
    String name = "hdmi";

    public void connect();
}

// usb 接口
interface Usb {
    // 打印型号
    // 抽象方法（默认自带 public abstract 修饰符）
    public void printType();

    // 使用 default 关键字提供默认主体，实现类可以选择性地去重写（Override）它. @Java8+
    default public void printManufacturer() {
        System.out.println("This is a generic USB device.");
    }

    // static 静态方法必须要有方法体
    public static void printGenerateDate() {
        System.out.println(LocalDateTime.now().toString());

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // // 自定义的格式 2026-09-22B13:39:16，需要用单引号把 B 引起来
        // DateTimeFormatter formatter =
        // DateTimeFormatter.ofPattern("yyyy-MM-dd'B'HH:mm:ss");

        String formattedTime = now.format(formatter);
        System.out.println(formattedTime);
    }
}

// UsbA 接口，继承了 Usb 接口
interface UsbA extends Usb {
    // 声明 2 个方法

    // 开始工作
    public void start();

    // 停止工作
    public void stop();
}

// 照相机类，实现（implement）了接口 UsbA: 把接口中所有声明的方法都实现
class Camera implements UsbA, Hdmi {
    public void start() {
        System.out.println("camera start");
    }

    public void stop() {
        System.out.println("camera stop");
    }

    public void printType() {
        System.out.println("camera use usba");
    }

    public void connect() {
        System.out.println("camera connect hdmi");
    }

}

// 手机类，实现接口 UsbA
class Phone implements UsbA {
    public void start() {
        System.out.println("phone start");
    }

    public void stop() {
        System.out.println("phone stop");
    }

    public void printType() {
        System.out.println("phone use usba");
    }
}

// 电脑类。借助 UsbA 接口调用相机、手机实例
class Computer {
    public void useUsb(UsbA usb) {
        usb.start();
        usb.stop();
    }
}