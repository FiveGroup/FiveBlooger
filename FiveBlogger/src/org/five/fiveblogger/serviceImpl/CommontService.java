package org.five.fiveblogger.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.five.fiveblogger.Iservice.ICommontService;
import org.five.fiveblogger.modul.Commont;

public class CommontService implements ICommontService {

	@Override
	public List<Commont> getComListByArtId(String artId) {
		List<Commont> list = new ArrayList<Commont>();
		Commont c1 = new Commont();
		c1.setCommontId(1);
		c1.setContent("commont1");
		c1.setObserver("tiger");
		c1.setLikeNum(0);
		list.add(c1);
		return list;
	}

	@Override
	public boolean addCommont(Commont commont) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteCommont(String comId) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int likeCommont(String comId) {
		// TODO Auto-generated method stub
		return 2;
	}

}
