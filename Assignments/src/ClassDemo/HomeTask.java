package ClassDemo;

public class HomeTask extends Task{

	String subject;
	
	public HomeTask(String title, int priority, String subject) {
		super(title, priority);
		this.subject = subject;
	}


	@Override
	public void completeTask() {
		String s = "Task "+ title + " with priority "+ priority + " subject " + subject + " Done";
		System.out.println(s);
		
	}
	
	

}
