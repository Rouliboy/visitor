package org.jvi.visitor;

import org.jvi.visitor.api.Product;
import org.jvi.visitor.impl.Book;
import org.jvi.visitor.impl.Fruit;
import org.jvi.visitor.impl.ShoppingCartVisitor;

public class MainApp {

	public static void main(String[] args) {
		Product[] products = new Product[]{new Book(25, "Mon Livre"), new Fruit(2, 6, "Apple")};

		ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitor();

		double price = 0;
		for (Product product : products)
		{
			price += product.accept(shoppingCartVisitor);
		}

		System.out.println("Price = " + price);

	}

}
