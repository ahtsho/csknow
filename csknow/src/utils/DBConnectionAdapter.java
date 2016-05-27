package utils;

import java.sql.*;

public class DBConnectionAdapter {

	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection == null) {
			
				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			try {
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/csknow",
								"madscientist", "AvA46C466C80LoN");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	public static void main (String args []){
		@SuppressWarnings("unused")
		Connection ac = getConnection();
		try {
			Statement st=ac.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM topics left join articles on topics.id=articles.topic_id");
			rs.next();
			System.out.println(rs.getString("title"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
