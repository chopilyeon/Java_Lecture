package kr.ac.kopo.day13;

import java.io.Serializable;

public class Icecream implements Serializable {

	private String name;
	private int price;
	private transient String company; // 객체직렬화할때 빼겠다는 의미가 됨.
	
	public Icecream() {
		super();
	}

	public Icecream(String name, int price, String company) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Icecream [name=" + name + ", price=" + price + ", company=" + company + "]";
	}

	
	
	
}
