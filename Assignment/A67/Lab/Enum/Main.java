package A67.Lab.Enum;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Main {
    public static void main(String[] args) {
        Operations add =  Operations.ADD;
        System.out.println(add.eval(4,5));

        Operations sub =  Operations.SUB;
        System.out.println(sub.eval(40,5));

        Operations mul =  Operations.MUL;
        System.out.println(mul.eval(4,5));

        System.out.println(evaluteEnumOpe(Operation.ADD, 10,5));
        System.out.println(evaluteEnumOpe(Operation.MUL, 10,5));
        System.out.println(evaluteEnumOpe(Operation.SUB, 10,5));

    }

    public static int evaluteEnumOpe(Operation op, int x, int y) {
        int result = 0;

        switch (op){
            case ADD:
                result = x+y;
                break;
            case MUL:
                result = x*y;
                break;
            case SUB:
                result = x-y;
             break;
        }
        return result;
    }
}
