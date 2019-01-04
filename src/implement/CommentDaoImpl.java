package implement;

import java.util.Calendar;

import dao.Commentdao;
import dbc.DB;
import valueBean.Comment;

public class CommentDaoImpl implements Commentdao {

	DB dbc = new DB();
	
	public CommentDaoImpl(){
		dbc = new DB();
	}
	
	@Override
	public boolean addComment(Comment comment) {
		
		//暂时把newsid、uid和content的获取方式写成相同
		int newsid = comment.getNewsid();
		int uid = comment.getUid();
		String content = comment.getContent();
		
		String sql = "insert into comment(newsid, content, uid, comtime ) "
				+ "values(?,?,?,?)";
		Calendar calender = Calendar.getInstance();
		String pdate = calender.get(Calendar.YEAR) + "-" + 
			(calender.get(Calendar.MONTH)+1) + "-" +
			calender.get(Calendar.DAY_OF_MONTH) + " " +
			calender.get(Calendar.HOUR_OF_DAY)+ ":" +
			calender.get(Calendar.MINUTE);
		
		return dbc.exeUpdate(sql, newsid, content, uid , pdate);
	}

	@Override
	public boolean delComment(int comid) {
		
		String sql = "delete from comment where comId="+ comid;
		
		return dbc.exeUpdate(sql);
	}

}
