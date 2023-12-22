package ex06;

class Employee01 {
    public int baseSalary = 3000000;

    int getSalary() {
        return this.baseSalary;
    }
}

class Manager01 extends Employee01 {
    int getSalary() {
        return (super.baseSalary + 2000000);
    }
}

class Programmer01 extends Employee01 {
    int getSalary() {
        return (super.baseSalary + 3000000);
    }
}

public class Test01 {
    public static void main(String[] args) {
        Manager01 obj1 = new Manager01();
        System.out.println("관리자의 월급: " + obj1.getSalary());

        Programmer01 obj2 = new Programmer01();
        System.out.println("프로그래머의 월급: " + obj2.getSalary());
    }
}
