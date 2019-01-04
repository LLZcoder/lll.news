package valueBean;

public class User {

	// 作者：林旭 。
	// 时间：2019.1.3
	// 功能：用于登录系统，进行系统管理操作的对象。
	// 管理员（管理其他用户以及新闻的账户）
	// 新闻发布单位（可发布新闻的用戶）。

	private int uid;
	private int level;
	private String uname;
	private String upass;
	private String inttime;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getInttime() {
		return inttime;
	}

	public void setInttime(String inttime) {
		this.inttime = inttime;
	}

}
