package com.vms.dao;

import java.sql.*;

public class DatabaseOperation {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/vms_shubham";
	private static String use = "root";
	private static String pwd = "";
	String INSERT_QUERY = "INSERT INTO REGISTRATIONTABLE(FNAME, MNAME, LNAME, PHONE_NO, EMAIL_ID, DOB, GENDER, PASSWORD) VALUES(?,?,?,?,?,?,?,?)";

	public void Jdbc(String f_name, String m_name, String l_name,String mobile_no,String e_mail,String DOB, String gender, String password) {
		System.out.println(1);
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, use, pwd);
			// Statement st=con.createStatement();
			// int count=st.executeUpdate("");
			PreparedStatement st = con.prepareStatement(INSERT_QUERY);
			int rows = 0;
			if (st != null) {
				
			st.setString(1, f_name);
			st.setString(2, m_name);
			st.setString(3, l_name);

			st.setString(4, mobile_no);
			st.setString(5, e_mail);
			st.setString(6, DOB);
			st.setString(7, gender);
			st.setString(8, password);
			
			rows = st.executeUpdate();
			}
			if (rows == 0)
				System.out.println("0 rows");
			else {
				System.out.println("Inserted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void appointment(String AdharNo, String Date,String Vac_Vaccine,String Vac_Center) {
			System.out.println(1);
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, use, pwd);
				// Statement st=con.createStatement();
				// int count=st.executeUpdate("");
				PreparedStatement st = con.prepareStatement("insert into book_appointment(adharno,date,vaccine,center) values(?,?,?,?)");
				if (st != null)
					System.out.println("conncetion");
				st.setString(1, AdharNo);
				st.setString(2, Date);
				st.setString(3,Vac_Vaccine);

//				st.setString(4, D_O_B);
				st.setString(4, Vac_Center);
				int rows = st.executeUpdate();
				if (rows == 0)
					System.out.println("0 rows");
				else {
					System.out.println("Inserted successfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		