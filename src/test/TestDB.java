package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.DBcon;

public class TestDB {
	public static void main(String[] args) {
		
		
		try {
			Connection conn = new DBcon().getconn();
			PreparedStatement pstm = conn.prepareStatement("select * from news");
			ResultSet rs_count = pstm.executeQuery();
			while(rs_count.next()){
				System.out.println(rs_count.getString("title"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql.executeQuery:ok" + e.getMessage() );
		}
	}
}
