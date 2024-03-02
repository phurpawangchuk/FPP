package Lab;

public class OrderOfExecution {
    OrderOfExecution(int num){
        System.out.println("6 - One argument"); //6
    }

    OrderOfExecution(){
        print();
        System.out.println("5 - No argument"); //5
    }

    static void print(){
        System.out.println("This is print()");
    }

    static {
        System.out.println("1 - 1st static init"); //1
    }
    {
        System.out.println("3 - 1st instance init"); //3
    }
    {
        System.out.println("4 - 2nd instance init"); //4
    }
    static {
        System.out.println("2 - 2nd static"); //2
    }

    public static void main(String[] args) {

        new OrderOfExecution();
        new OrderOfExecution(12);
        new OrderOfExecution();
    }
}
