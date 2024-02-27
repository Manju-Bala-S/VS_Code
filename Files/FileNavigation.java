import java.io.File;

public class FileNavigation {
    public static void main(String args[]){
        String dirname = "/samp";
        File f = new File(dirname);
        try{
            f.mkdir();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
