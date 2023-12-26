package ex06;

class Person {
    String name;

    public Person() {

    }

    public Person(String theName) {
        this.name = theName;
    }
}

class EmployeeTest extends Person {
    String id;

    public EmployeeTest() {

    }

    public EmployeeTest(Object name) {
        super(name.toString());
    }

    public EmployeeTest(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeTest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeTest e1 = new EmployeeTest("kim", "20210001");
        System.out.println(e1);
        EmployeeTest e2 = new EmployeeTest("kim");
        System.out.println(e2);
        EmployeeTest e3 = new EmployeeTest();
        System.out.println(e3);
    }
}
