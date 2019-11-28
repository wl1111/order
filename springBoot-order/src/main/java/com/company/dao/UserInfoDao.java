package com.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.UserInfo;

public interface UserInfoDao {
	
	/**
	 * 查询全部用户信息
	 * @return
	 */
	public List<UserInfo>  find();

	/**
	 * 根据用户名查询用户信息
	 * @param username
	 * @return
	 */
	public List<UserInfo>  findByUsername(String username);
	
	/**
	 * 根据用户名和密码查找用户信息
	 * @param username
	 * @param password
	 * @return
	 */
	public List<UserInfo>  findList(@Param("username")String username,@Param("userpass")String userpass);
	
	/**
	 * 增加一条用户信息
	 * @param user
	 * @return
	 */
	public int add(UserInfo user);
	/**
	 * 更新一条用户信息
	 * @param user
	 * @return
	 */
	public int update(UserInfo user);
	/**
	 * 根据用户名删除一条信息
	 * @param username
	 * @return
	 */
	public int delete(String username);
}
