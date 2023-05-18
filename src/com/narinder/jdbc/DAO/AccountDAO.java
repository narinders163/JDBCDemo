package com.narinder.jdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//DAO is data access object. It is a naming convention.
public class AccountDAO {
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root",
				"Momdad$163");
				Statement createStatement = connection.createStatement();
				ResultSet rs = createStatement.executeQuery("select * from account");) {

//			int result = createStatement.executeUpdate("insert into account values(5, 'Narinder', 'Narinder', 578)");
//			System.out.println("Rows got added : " + result);
//			int result = createStatement.executeUpdate("update account set bal=50000 where accno=5");
//			System.out.println("Rows got updated : " + result);
//			int result = createStatement.executeUpdate("delete from account where accno=5");
//			System.out.println("Rows got deleted : " + result);

			while (rs.next()) {
				System.out.println("{Account no: " + rs.getInt(1) + ", First name: " + rs.getString(2) + ", Last name: "
						+ rs.getString(3) + ", Balance: " + rs.getInt(4) + "}");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
