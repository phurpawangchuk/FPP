package Lab;

class MyClass {
    int i,j;
    MyClass(int x, int y){
        i = x;
        j = y;
    }

    public static void main(String[] args) {
        int x=9;
        if(x == 9){

        }
        MyClass m = new MyClass(7,8);
        System.out.println(m.i+" - "+m.j);

        //AnotherClass a = new AnotherClass(new MyClass());
    }
    private void myMethod() {
        System.out.println("hello");
    }
}
class AnotherClass {
    AnotherClass(MyClass m) {
//        m.myMethod();
    }
}