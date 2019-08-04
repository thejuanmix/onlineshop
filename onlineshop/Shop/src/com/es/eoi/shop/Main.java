package com.es.eoi.shop;

import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.managers.ArticleManager;
import com.es.eoi.shop.views.Menu;

public class Main {

	public static final Warehouse warehouse = new Warehouse(100);
	public static ArticleManager articleManager;
	public static int quantity = 1;

	public static void main(String[] args) {

		Warehouse.initWarehouse(warehouse, quantity);
		// Main.articleManager.save(article)
		Menu.printMainMenu();

	}

}
