package org.five.fiveblogger.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.five.fiveblogger.Iservice.ILoginService;
import org.five.fiveblogger.utils.CommonUtils;

public class LoginServiceImpl implements ILoginService {

	@Override
	public Map<String,Object> loggin(String username ,String password,HttpServletRequest request) {
		Map<String,Object> returnData = new HashMap<String,Object>();
		if(CommonUtils.isNotBlackAndEmpty(password)&&
				CommonUtils.isNotBlackAndEmpty(username)){
			if(username.equals("root")&&password.equals("000000")){
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				returnData.put("isSuccess", true);
			}
		}else {
			returnData.put("isSuccess", false);
		}
		return returnData;
	}

	@Override
	public Map<String,Object> logout(String username,HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
