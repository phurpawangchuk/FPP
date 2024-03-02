package Lab;

public class RecurssiveDemo {
    public static void main(String[] args) {
//        int num = 10;
//        do{
//            System.out.println(num--);
//        }while(num >> 1 >= 5);

        int result = powerOf10(5);
//        int factorial = findFactorial(6);
//        System.out.println(factorial);
//        System.out.println("main function end");
//        printCharsReverse("APPLE");
//        countDown(3);
//        int len = findLen("ORANGE");
//        System.out.println("Length: "+len);
    }

    private static int powerOf10(int num) {
        if(num == 0){
            return 1;
        }else{
            int sum = powerOf10(num - 1) * 10;
            System.out.println(sum);
            return sum;
        }
    }

    private static int findFactorial(int num) {
        if(num == 0 || num ==1){
            return 1;
        }else{
            int sum = num*findFactorial(num-1);
            System.out.println(sum);
            return sum;
        }
    }

    private static void printCharsReverse(String str) {
        if(str == null || str.equals(""))
            return;
        else{
            printCharsReverse(str.substring(1));
            System.out.println("Char at index("+str.charAt(0)+")");
        }

    }


    private static int findLen(String str) {
        if(str == null || str.equals("")){
            return 0;
        }{
            int sum = 1+findLen(str.substring(1));
            return sum;
        }
    }


    private static void countDown(int num) {
        System.out.println("Begenning of method countDown("+num+")");
        if(num <=0 ){
            System.out.println("End");
        }else{
            System.out.println(num);
            countDown(num-1);
        }
        System.out.println("Method end of countDown("+num+")");
    }

}
