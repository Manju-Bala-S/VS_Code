import java.io.*;

public class Filereader {
    public static void main(String args[]){
        try{
            FileReader fr= new FileReader("in.txt");
            FileWriter fw = new FileWriter("out.txt");
            int c;
            while((c=fr.read())>=0){
                fw.write(c);
            }
            fr.close();
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


