import java.sql.*;
public class jdbc_1_connection {
    public static void main(String[] args) {
        try{
            /* Step 1 */
            // loading jdbc sql drivers

            Class.forName("com.mysql.cj.jdbc.Driver");

            /* Step 2 */
            // setup url username and password

            String url = "jdbc:mysql://localhost:3306/my_db";
            String userName = "root";
            String password = "root";

            /* Step 3 */
            // creating connenction to the database named my_db

            Connection con = DriverManager.getConnection(url, userName, password);

            /* Step 4 */
            // checking connection has established or not.

            if(con.isClosed()){
                System.out.println("Connection failed");
            }
            else{
                System.out.println("Connection Successful");
            }

            /* Step 5 */
            // closing the connection.

            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
