package org.five.fiveblogger.utils;

public class CommonUtils {
	
	public static boolean isNotBlackAndEmpty(String str){
		if(str != null && str !=""){
			return true;
		}
		return false;
	}

}
