package A67.Lab.NestedClass;

import A67.Lab.Interface.MyInterface;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class MainIMyClass {

    void printMyClass(){
        //This using local inner class
        class MyClass implements IMyInterface {
            @Override
            public void doSomething(){
                System.out.println("Local");
            }
        }
        new MyClass().doSomething();
    }

    //This is using Member class
    class MyMemberClass implements  IMyInterface {
        @Override
        public void doSomething() {
            System.out.println("Inside memebr class");
        }
    }

    //This is static inner class
    public static class MyStaticInnerClass implements IMyInterface {
        @Override
        public void doSomething() {
            System.out.println("Inside static class");
        }
    }

    public static void main(String[] args) {

        int a = 0;
        int x = ++a * 5;
        int b = 1;
        int y = b++ * 2;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("a:"+a);
        System.out.println("b:"+b);


        //This using Anonymous Inner Class
       IMyInterface my = new IMyInterface (){
            @Override
            public void doSomething() {
                System.out.println("Anonymous");
            }
        };
       my.doSomething();

        //This using local inner class
//       new MainIMyClass().printMyClass();
        //OR
        //This using local inner class
        class MyClass implements IMyInterface {
            @Override
            public void doSomething(){
                System.out.println("Local");
            }
        }
        new MyClass().doSomething();

       //member class
        MainIMyClass m = new MainIMyClass();
        m.new MyMemberClass().doSomething();

       //Static inner class
        new MyStaticInnerClass().doSomething();

        //Lamda Express
        IMyInterface ml = ()-> System.out.println("Lamdra");
        ml.doSomething();
    }
}
