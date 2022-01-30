import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseConnection {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
     Class.forName("com.mysql.jdbc.Driver");
     
     String url="jdbc:mysql://localhost:3306/mondee";
     String username="root";
     String password="root";
     Connection connection=DriverManager.getConnection(url,username,password);
     if(connection!=null)
    	 System.out.println("Connection Established");
     Statement st=connection.createStatement();
     int x=st.executeUpdate("insert into infosys values(1029,'jack',75000)");
     if(x!=0)
    	 System.out.println("Record inserted");
	}

}


	


