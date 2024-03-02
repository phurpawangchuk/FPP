package Lab;

public class Test7 {
        public static void main(String[] args) {
            Test7 cl = new MySubClass();
            System.out.println(cl.compute());
        }
        private int value = 3;

        public int compute() {
            return value;
        }
    }

    class MySubClass extends Test7 {
        MySubClass() {}
        public int compute() {
            return (new MyInnerClass()).compute();
        }
        class MyInnerClass {
            private int compute() {
               // return value*value;
                return 1;
            }
        }
}
