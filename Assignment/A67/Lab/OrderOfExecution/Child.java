package A67.Lab.OrderOfExecution;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Child extends Parent {

    static String str = printAAA();

    static String printAAA() {
        System.out.println("00-MEEE");
        return "44";
    }

    {
       // printAAA();
        System.out.println("Print me");
    }
    String instanceStr;
    static {
        str = "Hellow World1";
        System.out.println("2. Child static block str = "+str);
    }
    {
        instanceStr = "Hi";
        System.out.println("5.9 Child instance block str = "+instanceStr);
    }

    Child(String s) {
        super(100);
        instanceStr = s;
        System.out.println("6.10 Child constructor instanceStr = "+instanceStr);
    }
}
