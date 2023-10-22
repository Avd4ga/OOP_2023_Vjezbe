package LabWeek3;

public class TaskItem {
    private int taskId;
    private String taskDescription;

    private Status taskStatus;

    public TaskItem(int Id,String Des,Status Stat){
        taskId=Id;
        taskDescription=Des;
        taskStatus=Stat;

    }
    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }
}
