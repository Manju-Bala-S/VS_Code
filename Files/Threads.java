class V extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("V");
        }
    }
}

class M extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("M");
        }
    }
}

public class Threads {
    public static void main(String args[]) throws InterruptedException{
        V obj1 = new V();
        M obj2 = new M();
        
        //obj1.start();
        //obj2.start();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.setPriority(9);
        obj2.setPriority(3);

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        /*obj1.start();
        obj2.start();*/

        obj1.join(20);
        obj2.join();

    }
}
