import java.util.concurrent.*;

class Task implements Runnable{
    int num;
    static int sum=0;
    int price;
    Task(int p1,int p2){
        num = p1;
        price = p2;
    }
    @Override
    public void run(){
        System.out.println("Task "+num+" is getting executed");
        try{
            sum=sum+price;
            Thread.sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class Will {
    public static void main(String args[]){
        ExecutorService exec = Executors.newFixedThreadPool(2);
        for(int i=0;i<=4;i++)
        {
            Task t=new Task(i,500);
            exec.execute(t);
        }
    }
}
