package A67.Lab.NestedClass;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class VehicleMain {
    class MyInnerClass {
        void show(){
            Vehicle v1 = new Vehicle ("BVM"){
                private String modelName = "Model Y";

                @Override
                public void printInstanceMethod(){
                    System.out.println("Print printInstanceMethod");
                }

            };
            v1.printInstanceMethod();


            Vehicle v2 = new Vehicle (){
                private String modelName = "Model E";

                @Override
                public void printInstanceMethod(){
                    System.out.println("Print printInstanceMethod");
                }

            };
            v2.printInstanceMethod();
        }
    }

    public static void main(String[] args) {
        VehicleMain vm = new VehicleMain();
        vm.new MyInnerClass().show();
    }
}
