package xjava010class07;

import javax.swing.JFrame;

public class Extends {

    public static void main(String []args) {

        CollegeStu cs = new CollegeStu();
        cs.name = "xm";
        cs.age = 18;
        cs.id = 1;
        // cs.fee = 3333.2f;
        System.out.println(cs.name);
        cs.printName();

        Window w = new Window();
        
    }
}


class Stu {
    public String name;
    protected int age;
    int id;
    private float fee;

    public void printName() {
        System.out.println(this.name);
    }
}


class CollegeStu extends Stu {

}

class Window extends JFrame {

    public Window() {
        this.setVisible(true);
        this.setSize(600, 500);
    }
}