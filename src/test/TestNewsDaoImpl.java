package test;

import java.util.List;

import implement.NewsDaoImpl;
import valueBean.News;

public class TestNewsDaoImpl {

	public static void main(String[] args) {
		
		/* 查询
		NewsDaoImpl ndi = new NewsDaoImpl();
		List list = ndi.selectAll();
		News news = null;
		
		for (int i = 0; i < list.size(); i++) {
			news = (News)list.get(i);
			
			System.out.println(news.getClassid());
			System.out.println(news.getContent());
			System.out.println(news.getTitle());
			System.out.println(news.getPubtime());
		}
		*/
		
		/*  添加
		NewsDaoImpl ndi = new NewsDaoImpl();
		boolean addNewsBoolean = ndi.addNews(1, "sdfsdfsdf", 2, "sfdsdgg", false);
		if( addNewsBoolean == true)
			System.out.println("添加成功");
		else
			System.out.println("添加失败");
		*/
		
		
		NewsDaoImpl ndi = new NewsDaoImpl();
		boolean addNewsBoolean = ndi.delNews(2);
		if( addNewsBoolean == true)
			System.out.println("删除成功");
		else
			System.out.println("删除失败");
		
	}
}
