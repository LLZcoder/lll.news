package implement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import dao.Newsdao;
import dbc.DB;
import valueBean.News;

/**
 * 
 * @author 林某某
 * time 2019年1月3日
 * 实现News对数据库的操作接口
 */
public class NewsDaoImpl implements Newsdao{
	
	DB dbc = null;
	
	public NewsDaoImpl(){
		dbc = new DB();
	}
	

	@Override
	//修改内容只限于“标题”和“新闻内容”
	public boolean updateNews(String title, String content, int newid) {

		String sql = "update news set title=? ,content=? where newsid=?";
		return dbc.exeUpdate(sql,  title , content , newid); 
	}

	@Override
	public boolean addNews(int classid ,String content, int uid ,String title, boolean pass){
		String sql = "insert into news(classid, content, uid, title, pass, pubtime ) "
				+ "values(?,?,?,?,?,?)";
		Calendar calender = Calendar.getInstance();
		String pdate = calender.get(Calendar.YEAR) + "-" + 
			(calender.get(Calendar.MONTH)+1) + "-" +
			calender.get(Calendar.DAY_OF_MONTH) + " " +
			calender.get(Calendar.HOUR_OF_DAY)+ ":" +
			calender.get(Calendar.MINUTE);
		
		return dbc.exeUpdate(sql, classid, content, uid, title, pass, pdate);
	}

	@Override
	public boolean delNews(int id) {

		String sql = "delete from news where newsid="+ id;
		return dbc.exeUpdate(sql);
	}

	@Override
	public List selectAll() {

		List list = new ArrayList();
		String sql = "select * from news";
		ResultSet rs = dbc.exeQuery(sql);
		News news = null;
		
		try {
			while( rs.next()){
				news = new News();
				news.setNewsid(rs.getInt(1));
				news.setClassid(rs.getInt(2));
				news.setContent(rs.getString(3));
				news.setUid(rs.getInt(4));
				news.setTitle(rs.getString(5));
				news.setPubtime(rs.getString(6));
				news.setPass(rs.getBoolean(7));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public News selectSingle(int id) {

		String sql = "select * from news where newsid=" + id;
		ResultSet rs = dbc.exeQuery(sql);
		News news = null;
		
		try {
			while( rs.next()){
				news = new News();
				news.setNewsid(rs.getInt(1));
				news.setClassid(rs.getInt(2));
				news.setContent(rs.getString(3));
				news.setUid(rs.getInt(4));
				news.setTitle(rs.getString(5));
				news.setPubtime(rs.getString(6));
				news.setPass(rs.getBoolean(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return news;
	}

}
