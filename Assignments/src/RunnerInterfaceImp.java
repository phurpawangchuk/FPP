
public class RunnerInterfaceImp implements I1 {

	public static void main(String[] args) {
		RunnerInterfaceImp obj = new RunnerInterfaceImp();
		obj.m1();
		
		I1 ob1 = new RunnerInterfaceImp();
		System.out.println(I1.x);
		System.out.println(ob1.x);
		//I1.x = I1.x+20;
		
		//System.out.println("");
	}

	@Override
	public void m1() {
		System.out.println("Inside m1() in I1 "+I1.x);
		
	}


}
