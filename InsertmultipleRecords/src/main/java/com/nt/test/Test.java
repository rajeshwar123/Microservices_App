package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
	private static final String query="INSERT INTO TAG_MASTER_DTLS(TAG_SEQ,VEHICLE_REG_NUM,VEHICLE_TYPE,TAG_START_DT,TAG_EXPIRY_DT,TAG_BAL,USER_ID,TAG_ID) VALUES(tag_seq.nextval,?,?,?,?,?,U1.nextval,T1.nextval)";
	public static void main(String[] args) throws Exception
	{
		
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//load the driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//establish the connection 
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		
		//create ps 
		if(con!=null)
			ps=con.prepareStatement(query);
		
		for(int i=1;i<=5000;i++) {
			
		//set ps param values
		ps.setString(1, "3110");
		ps.setString(2, "4 wheeler");
		ps.setString(3, "10/12/2019");
		ps.setString(4, "10/12/2025");
		ps.setInt(5, 5000);
		
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