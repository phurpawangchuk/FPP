package A67.Lab.OrderOfExecution;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Parent {
    static int value;
    int instanceValue;

    static{
        value = 10;
        System.out.println("1. Parent static block value ="+value);
    }
    {
        instanceValue = 20;
        System.out.println("3.7 Parent instacne block instaceValue = "+ instanceValue);
    }

    Parent(){}
    Parent(int v){
        instanceValue = v;
        System.out.println("4.8 Parent constrctor instanceValue = "+instanceValue);
    }
}
