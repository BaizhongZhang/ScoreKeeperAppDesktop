package WebService;

/**
 * Created by HenryChiang on 2015-11-15.
 */
public enum  TaskType {
    PLAYER("PLAYER"), TEAM("TEAM"), SCHEDULE("SCHEDULE");

    String value;

    TaskType(String value) {
        this.value = value;
    }

}

