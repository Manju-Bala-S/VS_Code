import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskName + " is being executed by thread: " + Thread.currentThread().getName());
        // Simulate some task execution
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskName + " completed.");
    }
}

public class One{

    public static void main(String[] args) {
        // Create an executor service with a fixed thread pool of size 3
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks for execution
        for (int i = 1; i <= 5; i++) {
            Task task = new Task(String.valueOf(i));
            executorService.execute(task);
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}
