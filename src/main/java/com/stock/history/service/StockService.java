package com.stock.history.service;

import java.util.List;

import com.stock.history.model.StockHistory;

public interface StockService {

	public List<StockHistory>findStockHistory(final String email);
	
	public StockHistory addStockHistory(final StockHistory history);
	
	public void clearStockHistory(final StockHistory history);
}
