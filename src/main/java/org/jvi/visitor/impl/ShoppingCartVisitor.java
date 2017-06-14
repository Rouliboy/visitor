package org.jvi.visitor.impl;

import org.jvi.visitor.api.Visitor;

public class ShoppingCartVisitor implements Visitor{

	@Override
	public double visit(Book book) {
		return book.getPrice() *0.75;
	}

	@Override
	public double visit(Fruit fruit) {
		return fruit.getPricePerKg() * fruit.getWeight();
	}

}
