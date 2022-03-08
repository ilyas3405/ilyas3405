package com.example.SpringbootMVCCRUD.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootMVCCRUD.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
