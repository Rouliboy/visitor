package org.jvi.visitor.impl;

import org.jvi.visitor.api.Product;
import org.jvi.visitor.api.Visitor;

public class Fruit implements Product {
	
	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int priceKg, int wt, String nm){
		this.pricePerKg=priceKg;
		this.weight=wt;
		this.name = nm;
	}
	
	public int getPricePerKg() {
		return pricePerKg;
	}


	public int getWeight() {
		return weight;
	}

	public String getName(){
		return this.name;
	}
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}