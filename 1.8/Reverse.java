public class Reverse {
    private String sent;
    public String rev;
    Reverse(String s)
    {
        sent = s;
    }

    StringBuilder sb = new StringBuilder();

    void showRev(){
        char[] a=sent.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]);
        }
        rev = sb.toString();
        System.out.println(rev);;
    }

    public static void main(String args[]){
        Reverse r =new Reverse("apple");
        r.showRev();
    }
}
