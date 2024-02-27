import java.util.concurrent.*;

class Task implements Runnable{
    int num;
    public static int sum=0;
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
            System.out.println("sum:"+sum);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Task "+num+" completed");
    }
}

public class Will {
    static int temp=0;
    public static void main(String args[]){

        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0;i<=4;i++)
        {
            Task t=new Task(i,500);
            exec.execute(t);
            temp += Task.sum;
            //System.out.println("Teamp:"+temp);
        }
        exec.close();
        System.out.println("Total:"+Task.sum);
    }
}
