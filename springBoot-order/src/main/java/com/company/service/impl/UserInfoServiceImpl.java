package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.UserInfoDao;
import com.company.pojo.UserInfo;
import com.company.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	UserInfoDao userInfoDao;
	@Override
	public List<UserInfo> find() {
		return userInfoDao.find();
	}

	@Override
	public List<UserInfo> findByUsername(String username) {
		return userInfoDao.findByUsername(username);
	}

	@Override
	public List<UserInfo> findList(String username, String userpass) {
		return userInfoDao.findList(username, userpass);
	}

	@Override
	public boolean add(UserInfo user) {
		return userInfoDao.add(user)>0?true:false;
	}

	@Override
	public boolean update(UserInfo user) {
		return userInfoDao.update(user)>0?true:false;
	}

	@Override
	public boolean delete(String username) {
		return userInfoDao.delete(username)>0?true:false;
	}

}
