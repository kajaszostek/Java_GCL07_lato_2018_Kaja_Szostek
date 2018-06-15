import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class Worker {

    Thread thread;
    WorkerListener workerListener;
    LinkedBlockingQueue<Contener> tasks;
    String workerName;

    boolean isStarted = false;
    boolean isWorking = false;


    Worker(String workerName)
    {
        System.out.println("Worker constructor \n");
        tasks=new LinkedBlockingQueue<Contener>();
        this.workerName=workerName;
    }

    public synchronized void start() {
        if (thread != null)
            return;

        String threadName = "Worker " + this.workerName + " thread";
        thread = new Thread(threadName) {
            @Override
            public void run() {

                int taskNumber = 0;
                workerListener.onWorkerStarted();
                while (true) {
                    try {
                       Contener temporary = tasks.take();
                        workerListener.onTaskStarted(taskNumber,temporary.getTaskName() );
                        temporary.getTask().run(taskNumber);
                        workerListener.onTaskCompleted(taskNumber,temporary.getTaskName());
                        taskNumber++;
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                workerListener.onWorkerStopped();
            }
        };
        thread.start();

    }

    public synchronized void stop() {
        if (thread == null)
            return;

                System.out.println("Stop current thread");
                thread.interrupt();
                thread = null;
            }


            synchronized void enqueueTask(String taskName, Task task) throws InterruptedException {
                System.out.println("Enqueue new task \n");
                Contener temporary = new Contener(task, taskName);
                tasks.put(temporary);
                notify();
            }

            public void setListener(WorkerListener workerL) {
                workerListener = workerL;
            }


            boolean isStarted() {
                return isStarted;
            }

            boolean isWorking() {
                return isWorking;
            }



        }