package A67.Lab.NestedClass;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public abstract class Vehicle {
    private String name;

    Vehicle(){}

    Vehicle(String name){
        System.out.println("Name "+name);
    }

    public void printInstanceMethod(){
        System.out.println("printInstanceMethod : "+name);
    }

}
