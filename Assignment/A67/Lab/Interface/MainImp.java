package A67.Lab.Interface;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class MainImp implements MyInterface{

    @Override
    public void myAbstractMethodInsideInterface() {
        MyInterface.staticeMethodInsideInterface();
        myDefaultMethodInsideInterface();

        System.out.println("myInstanceMethodInsideInterface inside interface.");
    }

    public static void main(String[] args) {
        MainImp obj =  new MainImp();
        obj.myAbstractMethodInsideInterface();
    }


}
