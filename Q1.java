package databaseW12SH2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Q1 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/e";
		String uName = "root";
		String pass = "Scooby@100200";
		String query = "CREATE table Employee(Emp_ID int, First_name varchar(20), Last_name varchar(20), Salary int, Dept_ID int, Email varchar(25), City varchar(20))";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st = con.createStatement();
		st.executeUpdate(query);

		st.close();
		con.close();
	}
}
