package com.azure.container;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;

@SpringBootApplication
public class AzureFileShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureFileShareApplication.class, args);
		System.out.println("Welome");
	
	}
}
