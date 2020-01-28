package com.stock.history.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stock.history.model.StockHistory;

public interface StockRepository extends MongoRepository<StockHistory , String> {

	List<StockHistory> findByEmail(final String email);
}