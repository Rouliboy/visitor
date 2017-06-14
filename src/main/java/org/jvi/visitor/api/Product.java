package org.jvi.visitor.api;

/**
 * 
 * @author julien
 *
 */
public interface Product {

	double accept(Visitor visitor);
}
