package com.es.eoi.shop.entities;

import com.es.eoi.shop.utils.ArticleFactory;

public class Warehouse {

	private Article[] articles;

	public Warehouse(int size) {
		this.articles = new Article[size];
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

	public static void initWarehouse(Warehouse warehouse, int quantity) {

		for (int i = 0; i < quantity; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("textil");
			warehouse.getArticles()[i].setId(i);
			warehouse.getArticles()[i].setName("Camiseta " + i);
			warehouse.getArticles()[i].setDescription("Descripción de la prenda" + i);
			warehouse.getArticles()[i].setPrice((i) * 1.0);
			warehouse.getArticles()[i].setStock(i);
			((Textile) warehouse.getArticles()[i]).setColor("Rojo");
			((Textile) warehouse.getArticles()[i]).setSize("M");
		}
		for (int i = quantity; i < quantity*2; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("alimentacion");
			warehouse.getArticles()[i].setId(i);
			warehouse.getArticles()[i].setName("Manzana " + i);
			warehouse.getArticles()[i].setDescription("Descripción del Alimento " + i);
			warehouse.getArticles()[i].setPrice(i * 1.0);
			warehouse.getArticles()[i].setStock(i);
			((Food) warehouse.getArticles()[i]).setExpirationDate("06/02/199" + i);
			((Food) warehouse.getArticles()[i]).setAllergens("Pescado y Frutos Secos");
		}
		for (int i = quantity*2; i < quantity*3; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("electronica");
			warehouse.getArticles()[i].setId(i);
			warehouse.getArticles()[i].setName("Móvil " + i);
			warehouse.getArticles()[i].setDescription("Descripción de la tecnología" + i);
			warehouse.getArticles()[i].setPrice(i * 1.0);
			warehouse.getArticles()[i].setStock(i);
			((Electronics) warehouse.getArticles()[i]).setPower("12V");
			((Electronics) warehouse.getArticles()[i]).setGuarantee(2.0);
		}

	}

}
