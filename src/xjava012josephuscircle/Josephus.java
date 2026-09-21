package xjava012josephuscircle;

/**
 * 约瑟夫丢手帕问题
 * 设编号为 1，2，...，n 的 n 个人围坐一圈，约定编号为 k(1 <= k <= n) 的人从 1 开始报数，
 * 数到 m 的那个人出列，它的下一位又从 1 开始报数，数到 m 的那个人又出列，依次类推，
 * 直到所有人出列为止，由此产生一个出队编号的序列。
 * 
 * SinglyCircularLinkedList
 */

public class Josephus {
    public static void main(String[] args) {
        SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
        scll.setLen(100);
        scll.setK(2);
        scll.setM(3);
        scll.createLink();
        System.out.println("游戏前，小孩顺序是：");
        scll.showLink();
        scll.playGame();
        System.out.println("游戏后，小孩顺序是：");
        scll.showLink();

    }
}

class Child {
    int no;
    Child nextChild = null;

    public Child(int no) {
        this.no = no;
    }

}

class SinglyCircularLinkedList {
    // 先定义一个指向链表的第一个小孩
    Child firstChild = null;
    Child tempChild = null;

    int len = 0; // 共有多少个小孩
    int k = 0; // 从第几个小孩开始数
    int m = 0; // 数到几的小孩退出圈

    // 设置环形链表的大小
    public void setLen(int len) {
        this.len = len;
    }

    // 设置从第几个小孩开始数
    public void setK(int k) {
        this.k = k;
    }

    public void setM(int m) {
        this.m = m;
    }

    // 初始化环形链表
    public void createLink() {
        for (int i = 1; i <= this.len; i++) {
            Child ch = new Child(i);
            // 先创建第一个小孩
            if (i == 1) {
                this.firstChild = ch;
                this.tempChild = ch;
            } else { // 后面的小孩依次创建
                this.tempChild.nextChild = ch;
                this.tempChild = ch;
                // 默认先把下一个节点指向第一个小孩
                ch.nextChild = firstChild;
            }
        }

    }

    // 打印环形链表
    public void showLink() {
        Child tempChild = this.firstChild;
        do {
            System.out.println(tempChild.no);
            tempChild = tempChild.nextChild;
        } while (tempChild.no != this.firstChild.no);
    }

    // 开始丢手帕游戏
    public void playGame() {
        // 数据校验：如果链表为空，或者参数不合法，直接返回
        if (firstChild == null || k < 1 || m < 1 || len < 1) {
            System.out.println("参数输入有误，无法开始游戏。");
            return;
        }

        // 创建临时节点，记录数数到第几个小孩
        Child tempChild = this.firstChild;
        Child beforeChild = this.firstChild;

        // 如果开始数数的值太大会超圈，那么设置为超圈后的值
        this.k = this.k % this.len;

        // 先找到开始数的那个小孩
        for (int i = 2; i <= this.k; i++) {
            beforeChild = tempChild;
            tempChild = tempChild.nextChild;
        }

        // 开始游戏，依次报数、退圈
        while (this.len != 1) {
            // 数 m 下
            for (int j = 2; j <= m; j++) {
                beforeChild = tempChild;
                tempChild = tempChild.nextChild;
            }

            // 将报数 m 的那个小孩出圈
            beforeChild.nextChild = tempChild.nextChild;
            System.out.print("出圈小孩：" + tempChild.no); // 打印出圈小孩的编号
            tempChild = tempChild.nextChild;
            beforeChild = tempChild;

            this.len--;
            System.out.println("，还有 " + this.len + " 个小孩");
        }
        System.out.println("游戏结束，最后还剩小孩 " + tempChild.no + ", 他的下一个小孩是 " + tempChild.nextChild.no);
        this.firstChild = tempChild;
    }
}
