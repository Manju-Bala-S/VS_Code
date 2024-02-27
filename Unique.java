import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Unique {
    public static void main(String[] args) {
        //HashMap<Character,Integer> m = new HashMap<>();
        HashSet<Character> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input:");
        String inp = sc.nextLine();
        System.out.println("inp:"+inp);
        for(int i=0;i<inp.length();i++){
            s.add(inp.charAt(i));
        }
        System.out.println(s);
    }
}
