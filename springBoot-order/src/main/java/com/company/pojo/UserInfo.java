package com.company.pojo;

/**
 * @author wl
 * @category 用户实体类
 *
 */
public class UserInfo {
	/**
	 * 用户编号
	 */
	private int userid;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 用户密码
	 */
	private String userpass;
	/**
	 * 用户头像
	 */
	private String userheadimage;
	/**
	 * 角色
	 */
	private int userrole;
	
	public UserInfo() {
		super();
	}
	
	public UserInfo(String username, String userpass, String userheadimage) {
		super();
		this.username = username;
		this.userpass = userpass;
		this.userheadimage = userheadimage;
	}

	public UserInfo(int userid, String username, String userpass, String userheadimage, int userrole) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpass = userpass;
		this.userheadimage = userheadimage;
		this.userrole = userrole;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUserheadimage() {
		return userheadimage;
	}
	public void setUserheadimage(String userheadimage) {
		this.userheadimage = userheadimage;
	}
	public int getUserrole() {
		return userrole;
	}
	public void setUserrole(int userrole) {
		this.userrole = userrole;
	}
	
	
}
