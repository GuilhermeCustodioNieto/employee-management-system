import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345678");

            Statement myStatment = connection.createStatement();

            ResultSet query = myStatment.executeQuery("select * from employees");

            while(query.next()){
                System.out.println(query.getString("first_name") + ", " + query.getString("last_name"));
            }
            System.out.println("Done");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
