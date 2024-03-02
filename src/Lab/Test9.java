package Lab;

public class Test9 {
    public static void main(String[] args) {
//        Test9 t = new Test9();
//        t.run();
    }
public void print(){

}
    private void run() {
        int count = 0;
        double s = 0.1;
        double x = 0.9;
        double y = 0.7;

        //0.8 != 0.8
        while(x-s != y+s){
            x *= s;
            y *= s;
            s *= s;
            count++;
        }
        System.out.println("ccc=="+count);
    }
}
