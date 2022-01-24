package com.charter.posismdb.data;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.charter.posismdb.entity.OrderInventory;


public interface InventoryOrderRepository extends MongoRepository<OrderInventory, String> {

//	public OrderInventory findByASNDocumentId(String posASNDocumentId);
// List<OrderInventory> findbyTransactionId(String posTransactionId);
	
}
