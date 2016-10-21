package org.five.fiveblogger.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.five.fiveblogger.Iservice.IArticleService;
import org.five.fiveblogger.orm.modul.Article;

public class ArticleServiceImpl implements IArticleService {

	@Override
	public List<Article> getArticleList() {
		List<Article> list = new ArrayList<Article>();
		Article art1 = new Article();
		Article art2 = new Article();
		art1.setArtId(1);
		art1.setAuther("root");
		art1.setTitle("Titile");
		art2.setArtId(2);
		art2.setAuther("root");
		art2.setTitle("Titile1");
		
		list.add(art1);
		list.add(art2);
		return list;
	}

	@Override
	public Article getArticleDetile(String artId) {
		Article art1 = new Article();
		art1.setArtId(1);
		art1.setAuther("root");
		art1.setTitle("Titile");
		art1.setContent("content");
		return art1;
	}

	@Override
	public boolean saveArticle(Article article) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateArticle(Article article) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteArticle(String artId) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int likeArdicle(String artId) {
		
		return 1;
	}

}
