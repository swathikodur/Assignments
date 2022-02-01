import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class EmployeeData
{
	static Scanner sc=new Scanner(System.in);
	
	static  void insert(Statement st)throws SQLException{
		System.out.println("Enter eid,ename,esalary");
		int eid=sc.nextInt();
		String ename=sc.next();
		int esalary=sc.nextInt();
		int x=st.executeUpdate("insert into infosys values("+eid+",'"+ename+"',"+esalary+")");
		if(x!=0) {
			System.out.println("Record inserted");
		}
	 }
	
	static void delete(Statement st)throws SQLException{
		System.out.println("Enter the eid you want to delete ");
		int eid=sc.nextInt();
		int x=st.executeUpdate("delete from infosys where eid = "+eid+" ");
		if(x!=0) {
			System.out.println("Record deleted");
		}
	}
	
	static void update(Statement st)throws SQLException{
		int x=st.executeUpdate("update infosys set esalary=esalary+ "+3000+" ");
		if(x!=0) {
			System.out.println("Record updated");
		}
	}
	
	  static void select(Statement st)throws SQLException{
		ResultSet rs=st.executeQuery("select * from infosys");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}}

	 public class EmployeeDatabase {
		// private static char ch;
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mondee";
	     String username="root";
	     String password="root";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		Statement st=connection.createStatement();
		
		EmployeeData e=new EmployeeData();
		char ch=' ';
		
		while(ch!='n') {
			System.out.println("Enter your choice\n 1.insert\n 2.delete\n 3.update\n 4.select");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			switch(num) {
			
			case 1:
				  e.insert(st);
				   break;
			case 2:
				e.delete(st);
				break;
			case 3:
				e.update(st);
				break;
			case 4:
				e.select(st);
				break;
			default:
				System.out.println("Exit");
				   
			}
			System.out.println("Do you want to continue y/n");
			ch=sc.next().charAt(0);
			if(ch=='n') {
				System.out.println("Exit");
			}
		}
		
	}
    }




