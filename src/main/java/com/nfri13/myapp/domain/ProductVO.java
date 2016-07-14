package com.nfri13.myapp.domain;

public class ProductVO { //dto나 vo나 거기서 거기지만 vo는 수정불가능.값만꺼내감
	private String name;
	private double price;
	
	public ProductVO(String name, double price) {
		this.name = name; 
		this.price= price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
}
