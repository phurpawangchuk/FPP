package A67.Lab.NestedClass;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
  class MyStaticNestedClass {
    private String s = "hello";

    MyStaticNestedClass() {
      //can access static method of inner class as usal way
        MyInnerStaticClass.myStaticMethod();
        //access instance method of inner class as usal way except
        MyInnerStaticClass myinner = new MyInnerStaticClass();
        myinner.myOtherMethod();
    }


    static class MyInnerStaticClass{
        private int x = 0;
        static void myStaticMethod(){
//           String t = s;  //Compiler error, no access
        }

        private void myOtherMethod(){

        }
    }
}
