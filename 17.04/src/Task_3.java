public class Task_3 implements Task {
    @Override
    public void run(int taskNumber) throws InterruptedException {

        System.out.println("Task_3");


        long time = System.currentTimeMillis();
        while(time+10000>System.currentTimeMillis())
        {
            Thread.yield();
        }

    }
}
