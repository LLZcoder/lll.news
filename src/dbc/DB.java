package dbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.DBcon;

public class DB {
	
	//作者：林旭
	//时间：2019.1.3
	//功能：对一个数据库连接进行操作，查询，修改，关闭连接。
	
	private Connection conn = null;
	private ResultSet rs = null;
	PreparedStatement pstm = null;

	public DB() {
		conn = new DBcon().getconn();
	}

	public boolean exeUpdate(String sql, Object... parame) {
		boolean flag = false;
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			int i = 1;
			for (Object object : parame) {
				pstm.setObject(i, object);
				i++;
			}
			int count = pstm.executeUpdate();
			if (count > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public ResultSet exeQuery(String sql, Object... parame) {
		try {
			pstm = conn.prepareStatement(sql);
			int i = 1;
			for (Object object : parame) {
				pstm.setObject(i, object);
				i++;
			}
			rs = pstm.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (pstm != null)
				pstm.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
