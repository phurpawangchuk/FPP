package Lab;

public class Test6 {
        public static void main(String[] args) {
            new Test6();
        }

        private int value = 3;

        Test6() {
            MyNestedClass c = new MyNestedClass();
            System.out.println(c.compute());
        }

        static class MyNestedClass {
            private int compute() {
                //return value;
                return 0;
            }
        }
}
