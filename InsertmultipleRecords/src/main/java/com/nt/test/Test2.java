package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test2 {
	private static final String query="INSERT INTO USER_MASTER_DTLS(USER_ID,FIRST_NAME,LAST_NAME,EMAIL_ID,MOBILE_NO,GENDER,UPDATE_DT,UPDATED_BY) VALUES(u1.nextval,?,?,?,?,?,?,?)";
	public static void main(String[] args) throws Exception
	{
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//load the driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//establish the connection s
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		
		//create ps 
		if(con!=null)
			ps=con.prepareStatement(query);
		
		for(int i=1;i<=5000;i++) {
		//set ps param values
		ps.setString(1, "Rajeshwar");
		ps.setString(2, "Godwe");
		ps.setString(3, "rajgodwe@gmail.com");
		ps.setString(4, "8975197523");
		ps.setString(5, "male");
		ps.setString(6, null);
		ps.setString(7, null);
		//execute the query
		count=ps.executeUpdate();
		}
		if(count!=0) {
			System.out.println("recoreds inserted sucessfully");
		}
		else
			System.out.println("not inserted");
	}
}