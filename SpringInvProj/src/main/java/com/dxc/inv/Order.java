package com.dxc.inv;

public class Order {
	
	private int qtyord,orderid;
	private Product objproduct;
	public int getQtyord() {
		return qtyord;
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Product getObjproduct() {
		return objproduct;
	}
	public void setObjproduct(Product objproduct) {
		this.objproduct = objproduct;
	}
	public void displayorder() {
		System.out.println("Quantity orderd: "+qtyord+ "Order ID: "+orderid);
		objproduct.getProduct();
	}
	}


