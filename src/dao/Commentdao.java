package dao;

import valueBean.Comment;

public interface Commentdao {

	public boolean addComment( Comment comment);

	public boolean delComment(int comid);
}
