package org.jvi.visitor.api;

import org.jvi.visitor.impl.Book;
import org.jvi.visitor.impl.Fruit;

public interface Visitor {
	
	double visit(Book book);
	
	double visit(Fruit fruit);
}
