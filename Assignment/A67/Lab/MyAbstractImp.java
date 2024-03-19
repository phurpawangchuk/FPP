package A67.Lab;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class MyAbstractImp extends MyAbstract{
    MyAbstractImp(int val) {
        super(val);
    }

    public static void main(String[] args) {

        //static method can be called from static method directly by using the class
        MyAbstract.staticMethod();
        MyAbstractImp.staticMethod(); //this subclass inherit super class, so it can call

        MyAbstractImp myAbstractImp = new MyAbstractImp(6);
        myAbstractImp.abstractMethod();
        myAbstractImp.instanceMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("This is abstractMethod implemented.");
    }
}
