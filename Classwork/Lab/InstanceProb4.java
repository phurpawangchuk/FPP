package Lab;

public class InstanceProb4 {
    static int count = 0;
    int nonStatic = 10;
    InstanceProb4(){
        count++;
    }

    public static int getCount(){
        return count;
    }

    public int getCountInstanceMethod(){
        return count;
    }

    public static void main(String[] args) {
        InstanceProb4 instance = null;
        for(int i=0; i<10; i++){
            instance = new InstanceProb4();
        }

        InstanceProb4 ins = new InstanceProb4();

        System.out.println(instance.getCount());
        System.out.println(instance.getCountInstanceMethod());
        System.out.println(count);
        System.out.println(ins.nonStatic);
    }
}
