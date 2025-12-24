//dbconnection
public class GetConnection {
    private static Connection con = null;
        public static Connection getConnection(){
            try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
            }
                 
                 catch(Exception e){
                         System.err.print(e);
                 }
                 return con;
            }
        }
        //
        public class GetConnection {
     private static Connection con = null;
        public static Connection getConnection(){
            try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
            }
                 
                 catch(Exception e){
                         System.err.print(e);
                 }
                 return con;
            }
}
