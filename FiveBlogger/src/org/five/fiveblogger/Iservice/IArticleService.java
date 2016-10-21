package org.five.fiveblogger.Iservice;

import java.util.List;

import org.five.fiveblogger.orm.modul.Article;

public interface IArticleService {
	
	public List<Article> getArticleList();
	
	public Article getArticleDetile(String artId);
	
	public boolean saveArticle(Article article);
	
	public boolean updateArticle(Article article);
	
	public boolean deleteArticle(String artId);
	
	public int likeArdicle(String artId);

}
