
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class RunnerCourse {

	public static void main(String[] args) {
		
		String s = "123";
		System.out.println(Integer.parseInt(s));
		
		System.out.printf("Haha hahha me %.2f dol",176f);
		System.out.printf("\n\nTime: %tc",new Date());
		
		
		String ss = String.format("\nHaha hahha me %.2f dol",176f);
		System.out.println(ss);
		
		//sysout
		Hashtable<String, Course> table = new Hashtable<String, Course>();
		table.put("CS390", new Course("CS390","FPP"));
		table.put("CS401", new Course("CS401","MPP"));
		table.put("CS472", new Course("CS472","Algo"));
		table.put("CS475", new Course("CS475","Andr"));
		
//		Set<String> keys = table.keySet();
//		
//		for(String s: keys) {
//			Course c = table.get(s);
//			if(c.getCname().startsWith("A")) {
//				System.out.print(c.getCname());
//			}
//		}
		
		HashMap<String, Course> table1 = new HashMap<String, Course>();
		table1.put("CS390", new Course("CS390","FPP"));
		table1.put("CS401", new Course("CS401","MPP"));
		table1.put("CS472", new Course("CS472","Algo"));
		table1.put("CS475", new Course("CS475","Andr"));
		table1.put("CS478", new Course("CS478","Andr"));
		table1.put("CS401", new Course("CS401","Apple"));
		table1.put("CS475", new Course("CS475","Andr"));
		table1.put("CS478", new Course("CS478","Andr"));
		table1.put("CS401", new Course("CS401","Apple"));
		
//		Iterator<String> it = table1.keySet().iterator();
//		while(it.hasNext()) {
//			String s = it.next();
//			Course c = table1.get(s);
//			if(c.getCname().startsWith("A")) {
//				System.out.print(c.getCname());
//			}
//		}
//		
		
		for(Course c: table1.values()) {
			if(c.getCname().startsWith("A")) {
				System.out.print(c.getCname());
			}
		}
//		Set<String> keys = table1.keySet();
//		for(String s: keys) {
//			Course c = table1.get(s);
//			if(c.getCname().startsWith("A")) {
//				System.out.println(c.cid+"="+c.getCname());
//			}
//		}

	}

}
