public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread  - START \n");
        System.out.println("Main thread - CREATE WORKER \n");
        Worker worker = new Worker("worker_1");
        worker.setListener(new WorkerListener() {
                                   @Override
                                   public void onWorkerStarted() {
                                       System.out.println("Work -START");
                                   }

                                   @Override
                                   public void onWorkerStopped() {
                                       System.out.println("Worker - STOPPED.");
                                   }

                                   @Override
                                   public void onTaskStarted(int taskNumber, String taskName) {
                                       System.out.println("TASK STARTED: " + taskNumber +" "+ taskName);
                                   }

                                   @Override
                                   public void onTaskCompleted(int taskNumber, String taskName) {
                                       System.out.println("TASK ENDED: " + taskNumber +" "+ taskName);
                                   }
                               });

        worker.enqueueTask("Task_1",new Task_1());
        worker.enqueueTask("Task_2",new Task_2());
        worker.enqueueTask("Task_3",new Task_3());

        worker.start();

        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        worker.enqueueTask("Task_4",new Task_2());
        try
        {
            Thread.sleep(40000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        worker.stop();
        System.out.println("MAIN THREAD - END");


    }
}
