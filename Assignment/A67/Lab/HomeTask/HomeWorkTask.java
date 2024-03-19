package A67.Lab.HomeTask;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class HomeWorkTask extends Task{
    private String subject;

    public HomeWorkTask(String title, int priority, String subject) {
        super(title, priority);
        this.subject = subject;
    }

    @Override
    public void completeTask(){
        System.out.println("Title = "+getTitle()+", Priority = "+getPriority()+", Subject = "+ subject);
    }
}
