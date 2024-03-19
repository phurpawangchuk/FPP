package A67.Lab.Singleton;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */

public class Singleton {
    //1. static instance
    private static Singleton instance=null;

    //2.  private constructor
    private Singleton(){}
    
    //3. One public static method to access
    public static Singleton getInstance(){
        if(instance == null){
            instance =  new Singleton();
        }else{
            System.out.println("Instance created");
        }
        return instance;
    }
}
