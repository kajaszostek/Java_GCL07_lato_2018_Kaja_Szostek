
public class Task_1 implements Task {

    @Override
    public void run(int taskNumber) throws InterruptedException {

        System.out.println("Task_1");

        long time = System.currentTimeMillis();
        double number1=20000;
        double number2=number1+System.currentTimeMillis();
        while(time+10000>System.currentTimeMillis())
        {
            double sum = Math.pow(number1,number2)+Math.pow(number2,number1);
            System.out.println(sum);
            if(Thread.interrupted())
                break;
        }

    }


}
