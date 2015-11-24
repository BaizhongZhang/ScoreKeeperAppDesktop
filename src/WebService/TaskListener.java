package WebService;

/**
 * Created by HenryChiang on 2015-11-15.
 */
public interface TaskListener {
    void onTaskCompleted(TaskType taskType, String result);

}
