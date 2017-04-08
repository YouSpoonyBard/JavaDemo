package sf.codingcomp.model;

import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName( "Task" )
    private String task;
    @SerializedName( "Priority" )
    private String priority;

    public String getTask() {
        return task;
    }

    public void setTask( String task ) {
        this.task = task;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority( String priority ) {
        this.priority = priority;
    }

}
