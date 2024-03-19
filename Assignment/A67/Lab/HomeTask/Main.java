package A67.Lab.HomeTask;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class Main {
    public static void main(String[] args) {
        Task[] task = new Task[3];
        HomeWorkTask homeWorkTask = new HomeWorkTask("Nested Class", 1, "Java");
        WorkTask workTask = new WorkTask("Recusion", 2, 5);
        Task task1 = homeWorkTask;

        task = new Task[]{homeWorkTask, workTask, task1};
        for(Task t: task){
            t.completeTask();
        }

    }
}
