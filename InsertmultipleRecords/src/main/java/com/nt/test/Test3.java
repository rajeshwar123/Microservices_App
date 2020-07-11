package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test3 {
	private static final String query="INSERT INTO TAG_TX_TRIGGERS(TX_ID,TAG_ID,VHCL_REG_NUM,TOLL_PLAZA_ID,TOLL_AMT,TX_STATUS,TX_FAILURE_RSN,REMINDER_MSG_SW,UPDATE_DT,UPDATED_BY) VALUES(TX_SEQ.nextval,?,?,?,?,?,?,?,?,?)";
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
		ps.setInt(1,i);
		ps.setInt(2, 3110);
		ps.setInt(3, 152);
		ps.setInt(4, 500);
		ps.setString(5, "Failure");
		ps.setString(6, "LowBal");
		ps.setString(7, "P");
		ps.setString(8, null);
		ps.setString(9, null);
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
