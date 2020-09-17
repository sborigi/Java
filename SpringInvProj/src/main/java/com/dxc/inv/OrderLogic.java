package com.dxc.inv;

import java.util.List;

public class OrderLogic {
	
	private List<Order> items;

	public List<Order> getItems() {
		return items;
	}

	public void setItems(List<Order> items) {
		this.items = items;
	}
	public void displayOrders() {
		for(Order order : items) {
			order.displayorder();
			int value=order.getQtyord()-order.getObjproduct().getQuantityavail();
			if(!(value>=0)) {
				System.out.println("Total Amount=" +(order.getObjproduct().getPrice()*order.getQtyord()));
			}
			else {
				System.out.println("Insufficient Products.....");
			}
		}
	}
}

