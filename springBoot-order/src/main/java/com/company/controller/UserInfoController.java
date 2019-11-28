package com.company.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.pojo.UserInfo;
import com.company.service.UserInfoService;
import com.company.util.SSOFileUpload;

@Controller
public class UserInfoController {
	@Autowired
	UserInfoService  userInfoService;
	@Autowired
	SSOFileUpload fileUpload;
	@RequestMapping(value = "/ssologin", method = RequestMethod.GET)
	public String ssologin(@RequestParam("from") String from, HttpServletRequest request) {
		System.out.println("coming....");
		HttpSession session = request.getSession(true);
		session.setAttribute("from", from);
		return "login";
	}
	@RequestMapping(value = "/ssoregist", method = RequestMethod.GET)
	public String ssoregist(HttpServletRequest request) {
		System.out.println("coming....regist");
		return "regist";
	}
	
	@RequestMapping(value = "/ssoregist", method = RequestMethod.POST)
	public String ssoregist(@RequestParam("userAccount") String username, @RequestParam("userPass") String password,
			HttpServletRequest request) {
		//头像上传
		String headimage = null;
		try {
			headimage = fileUpload.upload(request);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		UserInfo user = new UserInfo(username, password,headimage);
		userInfoService.add(user);
		return "registok";
	}
	
	@RequestMapping(value="/userlist")
	public String userlist(HttpServletRequest request){
		List<UserInfo> list = userInfoService.find();
		//将集合存入作用域中
		request.setAttribute("list", list);
		return "userlist";
	}
	
	@RequestMapping("/ok")
	public String ok() {
		return "loginok";
	}

}
