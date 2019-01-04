package dao;

import valueBean.User;

public interface Userdao {
	// 作者：林旭
	// 时间：2019.1.3
	// 功能：定义user可以完成的操作。决定需要写哪些功能。

	/**
	 * 这段为所有登录系统的用户都可以进行的操作。
	 * 
	 * @return
	 */
	public boolean login(User user) throws Exception;//登录

	public boolean addUser(User user);//添加用戶

//	public boolean delUser();//删除用户
	
	

}
