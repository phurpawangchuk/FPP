package Lab;

public class Employee {
    private String name;
    private double salary;

    Employee() {}

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void swap(Employee x, Employee y) {
        Employee temp = x;
        x= y;
        y = temp;

        System.out.println("X : "+x.name + "Salary = "+x.getSalary());
        System.out.println("Y : "+y.name + "Salary = "+y.getSalary());
        x.setSalary(45000);
        y.setName("Y-NewName");
    }
}
