// public class ExceptionPrac {
//    public static void main(String[] args) {
//     String s=null;
//     if(s!=null){
//         System.out.println(s);
//     }
//     else{
//         throw new NullPointerException("null");
//     }
//    }
// }


class MyException extends Exception{
    public MyException(String s){
        System.out.println(s);
    }
}

public class ExceptionPrac{
    public static void main(String[] args) throws MyException {
        String s=null;
        if(s!=null){
            System.out.println(s);
        }
        else{
            throw new MyException("NULL value");
        }
        //System.out.println("hello world");
    }
}
