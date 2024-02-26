
class RunnerInterfaceImpTest implements I2 {

	int x =15;
 
	@Override
	public void m2() {
		System.out.println("m2 in I2 "+x);
		
	}

	@Override
	public void m3() {
		System.out.println("m3 in I2 "+x);
		
	}

}
