package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-03-03
 */
public class PowerOf4 {
    public static void main(String[] args) {
        boolean res  =checkPowerOf4(64);
        System.out.println(res);
    }

    private static boolean checkPowerOf4(int num) {
        for(int i=0; i<Math.sqrt(num); i++){
            if(Math.pow(4,i) == num){
                return true;
            }
        }
        return false;
    }
}
