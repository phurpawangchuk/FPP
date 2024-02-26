import java.util.Arrays;

public class TestPoly {

	public static void main(String[] args) {
		
		I1 ob1 = new RunnerInterfaceImp();
		I1 ob2 = new RunnerInterfaceImp();
		I1 ob3 = new RunnerInterfaceImp();
		I1 ob4 = new RunnerInterfaceImp();
		I1 ob5 = new RunnerInterfaceImp();
		
		I2 ob6 = new RunnerInterfaceImpTest();
		I2 ob7 = new RunnerInterfaceImpTest();
		I2 ob8 = new RunnerInterfaceImpTest();
	
		I2[] coll2 = {ob6,ob7, ob7};
		
		for(I2 x: coll2) {
			System.out.println(x.x);
		}
		
		I1[] coll = {ob1,ob2, ob3,ob4, ob5};
		
		for(I1 x: coll) {
			System.out.println(x.getClass().getName());
		}

	}

}
