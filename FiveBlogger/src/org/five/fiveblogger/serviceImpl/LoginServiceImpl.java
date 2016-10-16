package org.five.fiveblogger.serviceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.five.fiveblogger.Iservice.ILoginService;
import org.five.fiveblogger.utils.CommonUtils;

public class LoginServiceImpl implements ILoginService {

	@Override
	public boolean loggin(String username ,String password,HttpServletRequest request) {
		if(CommonUtils.isNotBlackAndEmpty(password)&&
				CommonUtils.isNotBlackAndEmpty(username)){
			if(username.equals("root")&&password.equals("000000")){
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean logout(String username,HttpServletRequest request) {
		// TODO Auto-generated method stub
		return true;
	}

}
