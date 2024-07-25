package com.sql.Model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private int cId;
	private int uId;
	private String createDay;
	private List<CartItem> items;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getCreateDay() {
		return createDay;
	}

	public void setCreateDay(String createDay) {
		this.createDay = createDay;
	}

	public List<CartItem> getItems() {
		return items;
	}

	public void setItems(List<CartItem> items) {
		this.items = items;
	}

	public Cart() {
		this.items = new ArrayList<CartItem>();
	}

	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", uId=" + uId + ", createDay=" + createDay + ", items=" + items + "]";
	}

	private int checkId(CartItem item) {
		for (CartItem a : this.items) {
			if (a.getBook().getBId() == item.getBook().getBId()) {
				return this.items.indexOf(a);
			}
		}
		return -1;
	}

	public void add(CartItem item) {
		int index = checkId(item);
		if (index != -1) {
			int old_quantity = this.items.get(index).getQuantity() + 1;
			this.items.get(index).setQuantity(old_quantity);
		} else {
			this.items.add(item);	
		}
	}

	public void update(CartItem item) {
		int index = checkId(item);
		if (index != -1) {
			this.items.get(index).setQuantity(item.getQuantity());
		} else {
			this.items.add(item);
		}
	}

	public void delete(CartItem item) {
		int index = checkId(item);
		if (index != -1) {
			this.items.remove(index);
		}
	}

	public int total() {
		int total = 0;
		for (CartItem item : this.items) {
			total += item.getQuantity();
		}
		return total;
	}
	public int totalPrice() {
		int total = 0;
		for (CartItem item : this.items) {
			total += item.getQuantity() * item.getBook().getBPrice();
		}
		return total;
	}
	public int totalPriceSale() {
		int total = 0;
		for (CartItem item : this.items) {
			total += item.getQuantity() * item.getBook().getBPriceSale();
		}
		return total;
	}
}
