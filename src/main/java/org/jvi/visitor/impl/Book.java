package org.jvi.visitor.impl;

import org.jvi.visitor.api.Product;
import org.jvi.visitor.api.Visitor;

public class Book implements Product{

	private int price;
	
	private String isbnNumber;
	
	public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
	}
	
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
