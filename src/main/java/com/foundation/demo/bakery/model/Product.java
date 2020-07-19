package com.foundation.demo.bakery.model;

import java.util.Comparator;

import lombok.Data;

/**
 * @author bao.nguyentx
 *
 */
@Data
public class Product implements Comparator<Product> {
    
	/* Ma so thu tu sp */
	private int id;
	/* Ten loai sp */
	private String name;
	/* Thoi diem ban ra */
	private String timeOfSale;
	/* Thanh phan nguyen lieu */
	private String materials;
	/* So luong */
	private int quantity;
	/* Gia */
	private float price;
	/* Tong chi phi */
	private float totalCost;

	@Override
	public String toString() {
		return id + "," + timeOfSale + "," + name + "," + materials + "," + quantity + "," + price + "," + totalCost;
	}

	public String printScreen() {
		return "NO." + id + ", TIME: " + timeOfSale + ", PRICE: " + price + ", NAME: " + name;
	}

	/* Method so sanh sp theo gia, sort giam dan */
	@Override
	public int compare(Product o1, Product o2) {
		return (int) (o2.getTotalCost() - o1.getTotalCost());
	}

}
