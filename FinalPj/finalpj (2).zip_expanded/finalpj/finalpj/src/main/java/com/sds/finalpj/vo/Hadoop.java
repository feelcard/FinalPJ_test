package com.sds.finalpj.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Hadoop {

	public void connection() {

		try {
			Class.forName("org.apache.hive.jdbc.HiveDriver");

			Connection conn = DriverManager.getConnection("jdbc:hive2://52.78.187.212:10000/default", "root", "111111");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Test");
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			conn.close();
			System.out.println("Success....");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
