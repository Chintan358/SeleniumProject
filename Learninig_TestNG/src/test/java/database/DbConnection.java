package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DbConnection {
	
	@Test
	public void test()
	{
	
		try {
			//step1 : load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2 : define url
			String url = "jdbc:mysql://localhost:3306/seleniumtest";
			String user = "root";
			String pass = ""; 
			//step3 : establish co nnection
			Connection cn = DriverManager.getConnection(url,user,pass);
			
			//step4 create statement platform
			Statement st = cn.createStatement();
			
			//step5 exceue query
			ResultSet rs =   st.executeQuery("select * from login");
			
			//step6 process the resultset
			while(rs.next())
			{
				String username =  rs.getString("uname");
				String password =  rs.getString("pass");
				System.out.println(username+" "+password);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
