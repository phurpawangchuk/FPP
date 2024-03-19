package A67.Lab.NestedClass;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class MyOuterCLass {
    private String param;
    MyInnerClass inner;

    MyOuterCLass(String param){
        inner = new MyInnerClass("innerStr");
        this.param = param; //outerStr
    }

    void outerMethod(){
        System.out.println(inner.innerParam); //1. innerStr
        inner.innerMethod();
        //String t = inner.this.innerParam //Compiler error
    }

    class MyInnerClass {
        private String innerParam;

        MyInnerClass(String innerParam){
            this.innerParam = innerParam;
        }

        void innerMethod(){
            //Accessing outer param
            System.out.println(MyOuterCLass.this.param); //2. outerStr
            //Following is same as above
            System.out.println(param); //3. outerStr
        }
    }

    public static void main(String[] args) {
        new MyOuterCLass("outerStr").outerMethod();
    }
}
