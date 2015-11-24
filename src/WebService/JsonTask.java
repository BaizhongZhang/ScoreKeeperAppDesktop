package WebService;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;

/**
 * Created by HenryChiang on 2015-11-15.
 */
public class JsonTask extends SwingWorker<String, String> {

    private TaskListener mTaskListener;
    private TaskType taskType;


    public JsonTask(TaskType taskType, TaskListener taskListener){
        this.mTaskListener = taskListener;
        this.taskType = taskType;
    }

    @Override
    protected String doInBackground() {
        StringBuilder responseStrBuilder = new StringBuilder();
        URL url;
        try {

            switch (taskType){
                case PLAYER:
                    url = new URL(Constants.URL_ALL_PLAYERS);
                    break;
                case TEAM:
                    url = new URL(Constants.URL_ALL_TEAMS);
                    break;
                case SCHEDULE:
                    url = new URL(Constants.URL_ALL_SCHEDULE);
                    break;
                default:
                    url = new URL(Constants.URL_ALL_PLAYERS);
                    break;
            }

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            InputStream is = conn.getInputStream();
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String inputStr;


            while ((inputStr = streamReader.readLine()) != null)
                responseStrBuilder.append(inputStr);

            streamReader.close();

        } catch (IOException e) {
            return Constants.CONNECTION_FAILED;
        }

        return responseStrBuilder.toString();
    }

    @Override
    protected void done() {
        try {
            mTaskListener.onTaskCompleted(taskType,get());
        } catch (Exception e) {
            mTaskListener.onTaskCompleted(taskType,Constants.CONNECTION_FAILED);
        }

    }


}
