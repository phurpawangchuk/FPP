package Lab;

//Overlading:
// 1 - Same method name,
// 2 - number of parameters should be different
// 3 - Parameter should not have same type if  with same

public class Overloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
    }

    void sum(int a, int b){}
    int sum(char x, int y){ return 1;}
    int sum(double d) { return 1;}
    double sum(int x, int y, int z){return 0.0;}
    char sum(char c) { return c;}
    Employee sum(Employee e) { Employee temp = null; temp.setName("Changed"); return temp;}

}
