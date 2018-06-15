public class Contener {

    Task task;
    String taskName;

    Contener(Task t, String name)
    {
        this.task=t;
        this.taskName=name;
    }

    Task getTask()
    {return task;}

    String getTaskName()
    { return taskName; }

}
