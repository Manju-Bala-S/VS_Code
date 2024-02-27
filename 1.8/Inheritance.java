class A{
    A(){
        System.out.println("A");
    }
}

class B extends A{
    B(){
        System.out.println("B");
    }
}

class C extends A{
    C(){
        System.out.println("C");
    }
}

public class Inheritance {
    public static void main(String args[]){
        C b = new C();
        B c=new B();
    }
}
