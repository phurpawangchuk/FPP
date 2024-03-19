package A67.Lab.Reflection;

import java.util.Objects;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class Company {
    /**
     * Reflection can access and modify fields, can access private method
     * It is used by frmaeowrk and Library
     */
    private final String name;
    private int numberOfEmployee;

    public Company(String name, int numberOfEmployee) {
        this.name = name;
        this.numberOfEmployee = numberOfEmployee;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    private void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    private static void internalRules(){
        System.out.println("This is internal rule");
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", numberOfEmployee=" + numberOfEmployee +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if((obj == null) || (getClass() != obj.getClass()))
            return false;
        Company comp = (Company) obj;
//        return getNumberOfEmployee() == comp.getNumberOfEmployee() &&
//                getName().equals(comp.getName());
        return getNumberOfEmployee() == comp.getNumberOfEmployee() &&
                Objects.equals(getName(), comp.getName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(), getNumberOfEmployee());
    }
}
