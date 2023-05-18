package com.narinder.jdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveTable {
	public static void main(String[] args) {
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Momdad$163");
				Statement createStatement = connection.createStatement();
				ResultSet rs = createStatement.executeQuery("Select * from account");) {
//			int result = createStatement.executeUpdate("insert into account values(8, 'Aradhna', 'Sharma', 47859)");
//			System.out.println(result);
			
			
			System.out.println(rs);
			while(rs.next()) {
				System.out.println("{"+rs.getInt(1)+ ", " +rs.getString(2)+", "+rs.getString(3)+", "+rs.getInt(4)+"}");
			}
//			int balanceUpdate = createStatement.executeUpdate("update account set bal=5895 where accno=5");
//			System.out.println("The number of rows affected : "+balanceUpdate);
			
//			int executeUpdate = createStatement.executeUpdate("update account set accno=478 where accno=5");
//			System.out.println(executeUpdate);
			
//			int executeUpdate2 = createStatement.executeUpdate("delete from account where lastname='Narinder'");
//			System.out.println("The number of rows deleted: "+executeUpdate2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
