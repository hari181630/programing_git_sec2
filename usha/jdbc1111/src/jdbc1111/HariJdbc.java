package jdbc1111;
import java.sql.*;
public class HariJdbc {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Register succeful");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hari","root","System");
		if(Conn!=null)
		{
			System.out.println("Connected");	
		}
		else
		{
			System.out.println("not connected");
		}
				
		
		

	}

}
