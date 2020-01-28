package com.stock.history.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stock.history.model.StockHistory;
import com.stock.history.service.StockService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/stock")
public class StockController {

	@Autowired
	StockService stockService;

	@CrossOrigin
	@RequestMapping(value = "/findStockHistory/", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockHistory> findStockHistory(@RequestBody String email) {
		return stockService.findStockHistory(email);
	}

	@CrossOrigin
	@RequestMapping(value = "/addStockHistory", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StockHistory addStockHistory(@RequestBody StockHistory history) {
		return stockService.addStockHistory(history);
	}

	@CrossOrigin
	@RequestMapping(value = "/clearStockHistory", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void clearStockHistory(@RequestBody StockHistory history) {
		stockService.clearStockHistory(history);
		return;
	}
}
