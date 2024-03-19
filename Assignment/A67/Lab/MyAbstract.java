package A67.Lab;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public abstract  class MyAbstract {
    //abstract class can have static and non-static variables like normal class
    private static int staticVariable;
    private int instanceVariable;

    //it can also have a constructor that can be called from child constructor
    MyAbstract(int val){
        this.instanceVariable = val;
    }
    //can have static method
    public static void staticMethod(){
        System.out.println("This is static method.");
    }
    //can have normal class
    public void instanceMethod(){
        System.out.println("This is instance method.");
    }

    //abstract class without implementation, need to implement in the child class
    public abstract void abstractMethod();
}
