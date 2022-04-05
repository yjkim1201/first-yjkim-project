package com.hw3.model.vo;

public class Product {

	private String brand;
	private String name;
	private String color;
	private int price;
	
//积己磊何
	public Product() {
		super();
	}

	public Product(String brand, String name, String color, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	//皋家靛何
	@Override
	public String toString() {
		return "brand=" + brand + ", name=" + name + ", color=" + color + ", price=" + price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
	
}
