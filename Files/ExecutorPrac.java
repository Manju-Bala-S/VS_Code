import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    public static int taskNum=0;
    public static int sum=0;
    private int num;
    public Task(int p1){
        num = p1;
        taskNum++;
        System.out.println("Task "+taskNum+" created");
    }

    @Override
    public void run(){
        try {
            //sum+=num;
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskNum + " completed.");
    }
}

public class ExecutorPrac {
    public static void main(String args[]){
    ExecutorService one = Executors.newFixedThreadPool(4);
    Scanner sc = new Scanner(System.in);
    for(int i=0;i>=3;i++){
        //System.out.println("Enter input:");
        //int inp = sc.nextInt();
        Task t = new Task(5);
        one.execute(t);
    }
    //System.out.println("Current value:"+Task.sum);
    }
    
}
