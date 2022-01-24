package com.charter.posismdb.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.charter.posismdb.entity.OrderRetail;

public interface RetailOrderRepository extends MongoRepository<OrderRetail, String> {

	public OrderRetail findByposTransactionId(String posTransactionId);
	
}
