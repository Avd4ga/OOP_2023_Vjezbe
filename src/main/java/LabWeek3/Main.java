package LabWeek3;


import java.util.List;



public class Main {
    public static void main(String[] args) {

        DataStructures d1=new DataStructures();
        List <TaskItem> taskWords;
        taskWords=d1.getObj();

        System.out.println("All tasks:");
        for (TaskItem task: taskWords) {

            System.out.println();
            System.out.print(task.getTaskId()+" ");
            System.out.print(task.getTaskDescription()+" ");
            System.out.print(task.getTaskStatus());

        }

        List <TaskItem> task2;
        task2=d1.getTask2();

        System.out.println();
        System.out.println();
        System.out.println("Task with ID 2 or more:");
        for (TaskItem task: task2) {

            System.out.println();
            System.out.print(task.getTaskId()+" ");
            System.out.print(task.getTaskDescription()+" ");
            System.out.print(task.getTaskStatus());

        }

        List <TaskItem> taskWithStatus;
        taskWithStatus=d1.getByStatus(Status.COMPLETED);

        System.out.println();
        System.out.println();
        System.out.println("Task with Status COMPLETED:");
        for (TaskItem task: taskWithStatus) {

            System.out.println();
            System.out.print(task.getTaskId()+" ");
            System.out.print(task.getTaskDescription()+" ");
            System.out.print(task.getTaskStatus());

        }
        System.out.println();
        System.out.println();

        d1.getEachDesc();



    }
}
