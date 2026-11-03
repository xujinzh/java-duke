package xjava020set;

import java.util.ArrayList;

public class SetCustom {
    public static void main(String[] args) {

        String a = new String("abc");
        String b = new  String("abc");
        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a != b");
        }
    }
}

class EmpManage {
    private ArrayList<Object> al = null;

    public EmpManage() {
        al = new ArrayList<Object>();
    }

    // join a employee
    public void addEmp(Employee employee) {
        al.add(employee);
    }

    // show all employee
    public void showInfo(String empNo) {
        for (int i = 0; i < al.size(); i++) {
            Employee employee = (Employee) al.get(i);
            // 字符串相等比较的是地址相等，不是内容相等
            if (employee.getEmpNo().equals(empNo)) {
                System.out.println(employee.getName());
            }
        }
    }
}

class Employee {
    private String empNo;
    private String name;
    private float sal;

    public Employee(String empNo, String name, float sal) {
        this.empNo = empNo;
        this.name = name;
        this.sal = sal;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}