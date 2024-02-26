package ClassDemo;

public abstract class Task {
	

	 String title;
	 int priority;
	

	public Task(String title, int priority) {
		this.title = title;
		this.priority = priority;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public abstract void completeTask();

}
