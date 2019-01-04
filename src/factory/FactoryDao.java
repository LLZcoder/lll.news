package factory;

import dao.Userdao;
import dao.Newsdao;
import implement.UserDaoImpl;
import implement.CommentDaoImpl;
import implement.NewsDaoImpl;


public class FactoryDao {

	public static Userdao getUserDaoInstance(){
		return new UserDaoImpl();
		
	}
	
	public static Newsdao getNewsDaoInstance(){
		return new NewsDaoImpl();
		
	}
	
	public static CommentDaoImpl getCommentDaoInstance(){
		return new CommentDaoImpl();
		
	}
}
