package com.nfri13.myapp.domain;

public class ProductVO { //dto�� vo�� �ű⼭ �ű����� vo�� �����Ұ���.����������
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
