package Lab;

public class InstanceDemo {
    private static int count = 0;
    private static InstanceDemo instance = null;

    InstanceDemo(){
        count++;
    }

    public static InstanceDemo createInstance(){
        if(instance == null)
        {
            instance = new InstanceDemo();
        }
        return instance;
    }

    public static int getInstance(){
         return count;
    }

}
