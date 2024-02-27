// interface Demo{
//     void disp();
// }

// public class Lambda {
//     public static void main(String[] args) {
//         Demo d=()->{
//             System.out.print("in ");
//             System.out.println("show");
//         };
//         d.disp();
//     }
// }

// Parent interface
interface Animal {
    void makeSound();
}

// Child interface extending the parent interface
interface Mammal extends Animal {
    void giveBirth();
}

// Another interface extending the Animal interface
interface Bird extends Animal {
    void fly();
}

public class Lambda implements Mammal,Bird{
    static Animal obj1 = ()->{
        System.out.println("Animal");
    };
    public void giveBirth(){
        System.out.println("Mammal");
    };
    public void fly(){
        System.out.println("bird");
    }

    public static void main(String[] args) {
        obj1.makeSound();   
        Lambda l = new Lambda();
        l.giveBirth();
        l.fly();
    }

}
