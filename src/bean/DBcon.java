package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {

	// 作者：林旭
	// 时间：2019.1.3
	// 功能：新建 数据库连接
	// 方法getconn（）返回一个Connection

	private String dbdriver = "org.gjt.mm.mysql.Driver";
	private String dburl = "jdbc:mysql://localhost:3306/newsreport?characterEncoding=utf-8";
	private String user = "root";
	private String password = "123";
	private Connection conn = null;

	public DBcon() {
		try {
			Class.forName(dbdriver).newInstance();
			conn = DriverManager.getConnection(dburl, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Connection getconn() {
		return conn;
	}
}
