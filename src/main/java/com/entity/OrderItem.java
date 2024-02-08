package com.entity;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderItem {
	private Map<Product , Integer> items;

	public OrderItem(Map<Product, Integer> items) {
		
		this.items = items;
	}
	
	public Set<Entry<Product,Integer>> calculateTotal() {
		return items.entrySet();
	}
	
}
