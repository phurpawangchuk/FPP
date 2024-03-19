package A67.Lab.NestedClass;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class MyClass {
    private static String str = "Hello";

    public static void main(String[] args) {
        new MyClass();
    }

    MyClass(){
        //To access Inner class variable and method, we need innerclass object
        MyInnerClass myInnerClass = new MyInnerClass();
        System.out.println(myInnerClass.intVal);
        myInnerClass.innerClassMethod();
    }

    private void myOuterMethod(){
        System.out.println("I am outerMethod.");
    }

    private class MyInnerClass {
        private int intVal = 3;
        private void innerClassMethod(){
            //TO access outer class variable and method, we can directly access
            System.out.println("Inside my inner class "+str);
            myOuterMethod();
        }
    }
}
