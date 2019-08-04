package com.es.eoi.shop.interfaces;

import com.es.eoi.shop.entities.Article;

public interface Manageable {
		
	public void save(Article article);
	public void delete(Article article);
	

}
