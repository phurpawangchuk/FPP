package Lab;

class Test5 {
    public static void main(String[] args) {
        new Test5();
    }
    private int value = 3;

    Test5() {
        MyInnerClass c = new MyInnerClass();
        System.out.println(c.compute());
    }

    class MyInnerClass {
        private int compute() {
            return value;
        }
    }
}
