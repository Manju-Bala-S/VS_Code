class A{
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    //@Override
    public void show(){
        System.out.println("B");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}