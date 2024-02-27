import java.util.ArrayList;
import java.util.List;

public class RevArr {

    public static void rev(ArrayList a){
        for(int i=0,j=a.size()-1;i<a.size();i++,j--){
            int t1=(int) a.get(j);
            System.out.print("t1:"+t1);
            int t2=(int) a.get(i);
            System.out.println("  t2:"+t2);
            a.add(i, t1);
            a.add(j, t2);
        }
        System.out.println("a inside rev:"+a);
    }

   public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<>();
    int[] a1 = new int[5];
    int j=0;
    for(int i=1;i<=5;i++){
        a.add(i*5);
        a1[j] = i*5;
    }
    System.out.println(a);
    //System.out.println(a.reversed());
    System.out.println(a.size());
    rev(a);
   }
    
}
