package com.charter.posismdb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.charter.posismdb.data.InventoryOrderRepository;
import com.charter.posismdb.data.RetailOrderRepository;
import com.charter.posismdb.entity.OrderInventory;
import com.charter.posismdb.entity.OrderRetail;
import com.charter.posismdb.service.PerformActions;

@SpringBootApplication
public class PosisMongoDbApplication implements CommandLineRunner {

	@Autowired
	private InventoryOrderRepository repositoryASN;

	@Autowired
	private RetailOrderRepository repositoryRetail;

	// private OrderRetail retail1;
	//Using POJOs (Plain Old Java Objects) in a MongoDB database by using Spring Data MongoDB.
	public static void main(String[] args) {
		SpringApplication.run(PosisMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// No longer used. call any method on startup of spring boot application.
		// this.DeleteAll();

		OrderRetail retail1 = repositoryRetail.findByposTransactionId("27758c74-78b1-4295-85bf-08802b28a58e_352424090231274");
		System.out.println(retail1.getORIGINAL_SALE_REQUEST());
	}

}
