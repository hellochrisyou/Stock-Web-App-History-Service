package com.stock.history.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "searchHistory")
public class SearchHistory {
	
	@Id
	private String id;
	private String email;
	private String name;
	private String url;
//	public Date dateRecorded;
	
	public SearchHistory(){}

	public SearchHistory(SearchHistory history) {
		super();
		this.email = history.getEmail();
		this.name = history.getName();
		this.url = history.getUrl();
//		this.dateRecorded = baseHistory.getDateRecorded();
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
