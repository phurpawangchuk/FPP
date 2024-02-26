import java.sql.Array;
import java.util.Arrays;



public class EnumDemo {
	

	enum Gender {
		MALE,
		FEMALE,
		UNKNOWN
	}

//	public class GenderImp {
		
		 void display(Gender g) {
			switch(g)
			{
			case MALE: System.out.println("Male gender");
				break;
			
			case FEMALE: System.out.println("Female gender");
				break;
			
			default:System.out.println("Unknown");
				break;
	
			}
		}
//	}
	
	public static void main(String[] args) {
		
		Gender male = Gender.MALE;
		
		EnumDemo d = new EnumDemo();
//		d.display(Gender.UNKNOWN);
		
		int x = 20;
		String y = "30";
		Integer z = Integer.valueOf(y);
		
		System.out.println(z.max(x, x));
		
		Float f = 23.24f;
		
		
//System.out.println("x+z  ="+f.valueOf(f));

		
				
//		System.out.println(male);
//		
//		System.out.println(Arrays.toString(Gender.values()));
//		
//		for (Gender s : Gender.values()) {
//			System.out.println(s);
//		}
		
	}
	
}