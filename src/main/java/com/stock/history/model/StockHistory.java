package com.stock.history.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stockHistory")
public class StockHistory{

	@Id
	private String id;
	private String email;
	private String name;
	private String action;

	public StockHistory(StockHistory history) {
		super();
		this.email = history.getEmail();
		this.name = history.getName();
		this.action = history.getAction();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
}
