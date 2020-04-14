package bean;

import java.sql.*;

public class envoiEnBase {

	public static void envoi(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y, TriangleType triangle)
			throws SQLException {
		String url = "jdbc:mysql://localhost:3306/bdd_triangle?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		Connection connexion = null;
		Statement statement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection(url, user, password);
			statement = connexion.createStatement();
			String sql = "INSERT INTO bdd_triangle.pointetTriangle (firstpointx, firstpointy,secondpointx,secondpointy,\r\n"
					+ "thirdpointx,thirdpointy,typetriangle) values ('" + p1x + "','" + p1y + "','" + p2x + "','" + p2y
					+ "','" + p3x + "','" + p3y + "','" + triangle + "')";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connexion != null) {
				try {
					connexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
