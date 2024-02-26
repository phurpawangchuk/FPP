package ClassDemo;

public class Test {

	public static void main(String[] args) {
		
		Task[] tasks = { new HomeTask("Assignment5", 1, "FPP"),
						 new WorkTask("Project", 2, 30)
						};
		
		for(Task t: tasks) {
			t.completeTask();
		}

	}

}
