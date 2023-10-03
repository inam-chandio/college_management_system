/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbConnection;

/**
 *
 * @author 20CS008
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	private Dbconnection() {

	}

	public static Connection connection = null;

	public static Connection getConnection() {
		
		if(connection==null) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			try {
				connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "9787");
                                System.out.println("Connected");
                        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		return connection;
	}
}
