package ClassDemo;

public class WorkTask extends Task{
	
	private int deadLine;
	
	public WorkTask(String title, int priority, int deadLine) {
		super(title, priority);
		this.deadLine = deadLine;
	}

	@Override
	public void completeTask() {

		String s = "Task "+ title + " with priority "+ priority + " dealine" + deadLine + "  Done";
		System.out.println(s);
		
		
		
	}

	

}
