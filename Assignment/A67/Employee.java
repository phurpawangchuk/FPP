package A67;

import java.util.Objects;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class Employee {
    private String name;
    private  int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName()) && Objects.equals(getAddress(), employee.getAddress());
    }

    @Override
    public int hashCode() {
//        int result =19;
//        int hfname = getName().hashCode();
//        int hlname = getAddress().hashCode();
//        result += hfname+31*hfname;

        return Objects.hash(getName(), getAge(), getAddress());
    }
//
//    @Override
//    public int compareTo(Employee o) {
//        if(this.getAge() == o.getAge()) {
//            return this.getName().compareTo(o.getName());
//        }else{
//        }
//    }
}
