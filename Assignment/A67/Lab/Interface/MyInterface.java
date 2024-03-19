package A67.Lab.Interface;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public interface MyInterface {
    //public static final int MY_CONSTANT = 0 //This is implicit declaration
    int MY_CONSTANT = 10;

    //public abstract void myAbstractMethodInsideInterface() - implicit declaration
    void myAbstractMethodInsideInterface();

    //public default void myDefaultMethod(){}
    default void myDefaultMethodInsideInterface(){
        System.out.println("I am inside default()");
    }

    //public static void staticeMethodInsideInterface(){} // this is implicit
    static void staticeMethodInsideInterface(){
        System.out.println("I am inside static method");
    }

}
