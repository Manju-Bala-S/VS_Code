import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
            /*String sql = "select * from public.\"Student\";";
            String url = "jdbc:postgresql://localhost/postgres";
            String uname = "postgres";
            String pwd = "postgres";

            Connection conn = DriverManager.getConnection(url,uname,pwd);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(1));
            }
            rs.close();
            st.close();*/
            String dateString = "2024-01-25";
            String pattern = "yyyy-MM-dd";

            // Create a SimpleDateFormat object with the specified pattern
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            Date utilDate = new Date(dateFormat.parse(dateString).getTime());
            //String formattedDateString = dateFormat.format(date);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            // Output the parsed date
            System.out.println("Original String: " + dateString);
            System.out.println("Parsed Date (java.util.Date): " + utilDate);
            System.out.println("Converted Date (java.sql.Date): " + sqlDate);

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String name1;
        System.out.println("Enter id:");
        int id = sc.nextInt();
        System.out.println("Id:"+id);
        System.out.println("Enter name:");
        name1 = sc1.nextLine();
        System.out.println("Name:"+name1);
        /*System.out.println("Enter experience:");
        int experience = sc.nextInt();
        System.out.println("experience:"+experience);*/
    }
    }

