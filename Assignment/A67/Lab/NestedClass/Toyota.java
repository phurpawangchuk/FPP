package A67.Lab.NestedClass;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class Toyota extends Vehicle{
    private String modelName;
    Toyota(String modelName){
        System.out.println("Model name :"+modelName);
    }

    @Override
    public void printInstanceMethod(){
        System.out.println("Print printInstanceMethod");
    }
}
