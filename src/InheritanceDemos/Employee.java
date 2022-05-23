package InheritanceDemos;

public class Employee {

    int salary = 10000;

    void duties()
    {
        System.out.println("programming");
    }
}

class Programmer extends Employee
{
    int bonus = 3000;

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);

        System.out.println(p.salary);

        Employee e = new Employee();
        System.out.println(e.salary);

        e.duties();
        p.duties();
    }
}