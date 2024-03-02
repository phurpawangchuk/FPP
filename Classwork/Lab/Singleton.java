package Lab;

//Rules:
//1. There should be one private static instance
//2. Constructor should be declared private
//3. There should be one non-private method to access class from  outside

public class Singleton {
    private static Singleton instance = null; //R1
    private static String key;
    private static String dbName;

    private Singleton(){ //R2
        key = "ANSBDS";
        this.key = getKey();
        dbName = "FPP_DB";
    }
    //R3
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }else{
            System.out.println("Key is generated: "+ getKey());
        }
        return instance;
    }

    public static String getKey() {
        return key;
    }

    public static String getDbName() {
        return dbName;
    }
}
