package A67.Lab.HomeTask;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class WorkTask extends Task{
    private int deadLine;

    WorkTask(String title, int priority, int deadLine){
        super(title,priority);
        this.deadLine = deadLine;
    }

    @Override
    public void completeTask() {
        System.out.println("Title = "+getTitle()+", Priority = "+getPriority()+", DeadLine = "+ deadLine);
    }

    
}
