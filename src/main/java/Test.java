import java.sql.*;
public class Test{
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3308/classicmodels";
    	String uname="root";
    	String pass ="india@123";
    	
    	
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from customers where customerNumber>112");
		System.out.println("+------+---------------------------------+");
        System.out.println("  ID       NAME");
		while(rs.next())
		 {  
			System.out.println("+------+---------------------------------+");
			 int customerNumber = rs.getInt("customerNumber");
			 String customerName=rs.getString("customerName");
			 
			 System.out.println("  "+customerNumber+"    "+customerName);
		 }
		System.out.println("+------+---------------------------------+");
		
	}

	
}