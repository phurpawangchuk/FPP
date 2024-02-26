import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

public class Runner implements I1, I2{

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> temp = new ArrayList<String>();
		
		list.add("Abc");
		list.add("Bcd");
		list.add("Ccd");
		list.add("Dcd");
		list.add(0,"Zaa");
		list.remove(1);
	
//		Iterator<String> listA =  list.iterator();
//		while(listA.hasNext()) {
//			temp.add(listA.next());
//		}
			
		
		ArrayList<String> arrList = new ArrayList<String>(list);
		
		LinkedList<String> listL = new LinkedList<String>(list);
		listL.addFirst("First");
		listL.addLast("Last");
		listL.add(1, "One");
		Random rand = new Random();

		
		HashMap<String, Integer> hashList = new HashMap<String, Integer>();
		
		for(int i=1; i<10; i++)
		{
			
			  double randomNumber = Math.floor(rand.nextInt(1,9));
			  int randomInt = (int) randomNumber;
			  
			  hashList.put("Phurpa"+i, i);
		}
		
		Set<String> setList = new HashSet<String>();
		
		setList.addAll(listL);
		setList.add("Two");
		setList.add("Two");
		setList.add("One");
		setList.add("Two");
		
		//printSet(setList);
		
		
		
//		list.forEach(System.out::print);
		
		//printHasMap(hashList);
		
			//print(hashList);
		I1 ob1 = new Runner();
		ob1.m1();
		
		I2 ob2 = new Runner();
		ob2.m2();
		ob2.m3();
		
		System.out.println(ob1.x + ob2.x);
		

	}

	private static void printSet(Set<String> setList) {
		System.out.println(setList);
		
	}

	private static void printHasMap(HashMap<String, Integer> hashList) {
		System.out.print(hashList);
		
		System.out.println(hashList.containsKey("Phurpa8"));
		
	}

	private static void print(List<String> list) {
		System.out.println(list);
		
	}

	@Override
	public void m2() {
		System.out.println("In runner m2() in I2, "+I2.x);
		
	}

	@Override
	public void m3() {
		System.out.println("In runner m3() in I2, "+I2.x);
		
	}

	@Override
	public void m1() {
		System.out.println("In runner m1() of I1 "+I1.x);
		
	}

}
