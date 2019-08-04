package com.es.eoi.shop.managers;

import com.es.eoi.shop.Main;
import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.interfaces.Manageable;


public class ArticleManager implements Manageable {

	private Warehouse warehouse;

	public ArticleManager(Warehouse warehouse) {
		super();
		this.warehouse = warehouse;
	}

	@Override
	public void save(Article newArticle) {

		for (Article article : warehouse.getArticles()) {

			if (article.equals(null)) {
				article = newArticle;
			}
		}
	}

	@Override
	public void delete(Article deleteArticle) {

		for (Article article : warehouse.getArticles()) {

			if (article.equals(deleteArticle)) {
				article = null;
			}
		}
	}

	public static void print(Warehouse warehouse) {

		for (int i = 0; i < warehouse.getArticles().length; i++) {
			if (warehouse.getArticles()[i] != null) {
				System.out.println(warehouse.getArticles()[i]);
			}

		}
		
	}
	
	public static int returnLastID(Warehouse warehouse) {
		int id = 0;
		for (int i = 0; i < warehouse.getArticles().length; i++) {
			if (warehouse.getArticles()[i] == null) {
				id = i;
				break;
			}

		}
		return id;
		
	}
	
	public static void addArticleTextile(int id, String name, String description, double price, int stock) 
	{
		Main.warehouse.getArticles()[id].setId(id);
		Main.warehouse.getArticles()[id].setName(name);
		Main.warehouse.getArticles()[id].setDescription(description);
		Main.warehouse.getArticles()[id].setPrice(price);
		Main.warehouse.getArticles()[id].setStock(stock);
	}

}
