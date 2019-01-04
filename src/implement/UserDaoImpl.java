package implement;

import java.sql.ResultSet;

import dbc.DB;
import dao.Userdao;
import valueBean.User;

/**
 * 
 * @author 林良镇
 * time  2019年1月4日
 * function  实现User对数据库的操作接口
 */
public class UserDaoImpl implements Userdao {

	private DB dbc = null;
	
	public UserDaoImpl(){
		dbc = new DB();
	}
	
	@Override
	public boolean login(User user) throws Exception {
	
		boolean flag = false;
		String sql = "select * from users where uname=? and upass=?";
		
		ResultSet rs = dbc.exeQuery(sql, user.getUname() , user.getUpass());
		
		if( rs.next() )
			flag = true;
		
		rs.close();
		
		return flag;
	}

	@Override
	public boolean addUser(User user) {
		String sql = "insert into users(uname,upass) values(?,?)";
		return dbc.exeUpdate(sql, user.getUname(), user.getUpass());
	}

}
