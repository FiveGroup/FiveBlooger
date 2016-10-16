package org.five.fiveblogger.Iservice;

import java.util.List;

import org.five.fiveblogger.modul.Commont;

public interface ICommontService {
	
	public List<Commont> getComListByArtId(String artId);
	
	public boolean addCommont(Commont commont);
	
	public boolean deleteCommont(String comId);
	
	public int likeCommont(String comId);

}
