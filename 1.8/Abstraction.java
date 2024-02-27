abstract class One{
    protected int i=1;
    public abstract void show();
}

public class Abstraction extends One{
    public void show(){
        System.out.println("i:"+i);
    }
    public static void main(String[] args) {
        Abstraction a = new Abstraction();
        a.show();
    }
}