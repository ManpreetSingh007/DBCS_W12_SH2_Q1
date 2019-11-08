package databaseW12SH2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Q2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/e";
		String uName = "root";
		String pass = "Scooby@100200";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st = con.createStatement();
		String query = "Insert Into employees values (001,'Asta', 'Sharma', 100000, 20, 'asd@gmail.com, 'Mustafabad')";
		st.executeUpdate(query);
		query = "Insert Into employees values (002,'Yuno', 'Malhotra', 5000, 20, 'mal@gmail.com', 'Indri')";
		st.executeUpdate(query);
		query = "Insert Into employees values (003,'Noyell', 'Mittal', 80000, 10, 'mittal@gmail.com','Yamunanagar')";
		st.executeUpdate(query);
		query = "Insert Into employees values (004,'Zeth', 'Gujral', 90000, 20, 'tv@gmail.com', 'Delhi')";
		st.executeUpdate(query);
		query = "Insert Into employees values (005,'Arnold', 'Singh', 100000, 50, 'aayan@gmail.com', 'Mumbai')";
		st.executeUpdate(query);
		query = "Insert Into employees values (006,'Kirito', 'Khurana', 90000, 20, 'deepeshk@gmail.com','Mumbai')";
		st.executeUpdate(query);
		query = "Insert Into employees values (007,'Anabell', 'Gupta', 70000, 50, 'anshulg@gmail.com','Kolkata')";
		st.executeUpdate(query);
		query = "Insert Into employees values (008,'Ariana', 'Garg', 80000, 20, 'gopalg@gmail.com', 'Delhi')";
		st.executeUpdate(query);
		query = "Insert Into employees values (009,'Dua', 'Saini', 1000000, 10, 'bhuvi@gmail.com','Delhi')";
		st.executeUpdate(query);
		query = "Insert Into employees values (010,'Nick', 'Saini', 90000, 50, 'kamalp@gmail.com','mustafabad')";
		st.executeUpdate(query);

		st.close();
		con.close();
	}
}
