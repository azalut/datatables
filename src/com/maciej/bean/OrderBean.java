package com.maciej.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="order")
@RequestScoped
public class OrderBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String orderNo;
	private String productName;
	private BigDecimal price;
	private int qty;
	private static final ArrayList<Order> orderList = new ArrayList<Order>(Arrays.asList(
		new Order("A0001", "Intel CPU", new BigDecimal("700.00"), 1),
		new Order("A0002", "Harddisk 10TB", new BigDecimal("500.00"), 2),
		new Order("A0003", "Dell Laptop", new BigDecimal("11600.00"), 8),
		new Order("A0004", "Samsung LCD", new BigDecimal("5200.00"), 3),
		new Order("A0005", "A4Tech Mouse", new BigDecimal("100.00"), 10)
			));
	public ArrayList<Order> getOrderList() {
		return orderList;
	}
	
	public String dodaj(){
		orderList.add(new Order(this.orderNo, this.productName, this.price, this.qty));
		return null;
	}
	
	public String usun(Order order){
		orderList.remove(order);
		return null;
	}
	
	public String edytuj(Order order){
		order.setEditable(true);
		return null;
	}

	public String zapisz(){
		for(Order order : orderList){
			order.setEditable(false);
		}
		return null;
	}
	
	public static class Order{
		String orderNo;
		String productName;
		BigDecimal price;
		int qty;
		boolean editable;
		
		public Order(String orderNo, String productName, BigDecimal price, int qty) {
			this.orderNo = orderNo;
			this.productName = productName;
			this.price = price;
			this.qty = qty;
		}
		public boolean isEditable() {
			return editable;
		}

		public void setEditable(boolean editable) {
			this.editable = editable;
		}
		public String getOrderNo() {
			return orderNo;
		}

		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}

