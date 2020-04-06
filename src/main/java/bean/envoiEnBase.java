package bean;

import java.sql.*;

public class envoiEnBase {

	public static void envoi(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y) {
		String url = "jdbc:mysql://localhost:3306/bdd_triangle?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		Connection connexion = null;
		Statement statement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection(url, user, password);
			statement = connexion.createStatement();
			String sql = "INSERT INTO bdd_triangle.point (firstpointx, firstpointy,secondpointx,secondpointy,\r\n"
					+ "thirdpointx,thirdpointy) values ('" + p1x + "','" + p1y + "','" + p2x + "','" + p2y + "','" + p3x
					+ "','" + p3y + "')";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connexion.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
