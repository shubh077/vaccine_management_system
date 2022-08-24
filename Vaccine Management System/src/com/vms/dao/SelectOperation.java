package com.vms.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class SelectOperation {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/vms_shubham";
	private static String use = "root";
	private static String pwd = "";
	static Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	public ArrayList<String> select_appointment_details(String adharNo) {
		ArrayList<String> al = new ArrayList<String>();
		try {
			System.out.print(adharNo);
			Class.forName(driver);
			con =  (Connection) DriverManager.getConnection(url, use, pwd);
			st = con.createStatement();
			rs = st.executeQuery("SELECT  date, vaccine, center FROM book_appointment WHERE adharno ="+adharNo );
			while (rs.next()) {
				System.out.println(rs.getString("date"));
				al.add(rs.getString("date"));
				al.add(rs.getString("vaccine"));
				al.add(rs.getString("center"));
				System.out.println(al);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return al;
		}
}
