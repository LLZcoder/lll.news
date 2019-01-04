package dao;

import java.util.List;

import valueBean.News;

public interface Newsdao {

	public boolean updateNews(String title, String content, int newid);

	public boolean addNews(int classid ,String content, int uid ,String title, boolean pass);

	public boolean delNews(int id);

	public List selectAll();

	public News selectSingle(int id);

}
