package com.stock.history.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stock.history.model.SearchHistory;

public interface SearchRepository extends MongoRepository<SearchHistory , String> {

	List<SearchHistory> findByEmail(final String email);
}
