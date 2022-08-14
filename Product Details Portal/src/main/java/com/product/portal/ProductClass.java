package com.product.portal;
import java.util.ArrayList;
public class ProductClass {
	private int id;
	private String product;
	private float price;
	private String status;
	public ProductClass(int id , String product,float price,String status) {
		this.id= id;
		this.product=product;
		this.price=price;
		this.status=status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public ArrayList<ProductClass> getDetailst() {
		ArrayList<ProductClass> list = new ArrayList();
		list.add(new ProductClass(id, product,price,status));
		return list;
	}
}
