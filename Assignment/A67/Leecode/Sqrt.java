package A67.Leecode;

import static java.lang.Math.sqrt;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */

/**
 * to find the squart root without using the Math.Power
 *
 */
public class Sqrt {
    public static void main(String[] args) {
        int num = 9;
        int result = 0;
//4-2, 5-2, 16-4, 17-4, 25-5 etc

        for(int i=1; i<=num/2; i++){
            for(int j=i; j<=num/2; j++){
                if(i*j <= num && j*j>=num){
                    result = (i+j)/2;
                }
            }
        }

//        int left = 0;
//        int right = num;
//
//        while (left <= right){
//            int mid = (right+left)/2;
//            if(mid * mid <= num){
//                result = mid;
//                left = mid+1;
//            }else{
//                right = mid -1;
//            }
//
//        }

        System.out.println("Sqrt:" + result);
    }
}
