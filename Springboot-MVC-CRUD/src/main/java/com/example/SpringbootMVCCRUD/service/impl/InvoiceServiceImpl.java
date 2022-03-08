package com.example.SpringbootMVCCRUD.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringbootMVCCRUD.entity.Invoice;
import com.example.SpringbootMVCCRUD.exception.InvoiceNotFoundException;
import com.example.SpringbootMVCCRUD.repo.InvoiceRepository;
import com.example.SpringbootMVCCRUD.service.IInvoiceService;

@Service
public class InvoiceServiceImpl implements IInvoiceService {

	@Autowired
	private InvoiceRepository repo;

	@Override
	public Invoice saveInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return repo.save(invoice);
	}

	@Override
	public List<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Invoice getInvoiceById(Long id) {
		// TODO Auto-generated method stub
		Optional<Invoice> opt = repo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new InvoiceNotFoundException();
		}

	}

	@Override
	public void deleteInvoiceById(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public void updateInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		repo.save(invoice);
	}

}
