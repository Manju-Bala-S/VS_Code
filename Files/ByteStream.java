import java.io.*;

public class ByteStream{
    public static void main(String args[]) throws IOException{
        try {
            FileInputStream in = new FileInputStream("in.txt");
            FileOutputStream out=new FileOutputStream("out.txt");
            int c;
            while((c=in.read())>=0){
                out.write(c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}