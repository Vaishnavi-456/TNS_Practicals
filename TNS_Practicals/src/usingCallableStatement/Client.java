package usingCallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import JDBC_Hands_On.DB_Utility;

public class Client {
	
	public static void main(String[] args) {
		
		Connection cn = DB_Utility.getCn();
		
		try {
			
			CallableStatement cst = cn.prepareCall("{ ?= call getPer(?)}");
			cst.registerOutParameter(1, Types.DOUBLE);
			cst.setInt(2, 01);
			cst.execute();
			System.out.println("The Percentage is: "+ cst.getDouble(01));
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
	}

}
