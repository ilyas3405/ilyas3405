package com.example.SpringbootMVCCRUD.exception;

public class InvoiceNotFoundException extends RuntimeException{

	public static final long serialVersionUID = 1L;
	
	public InvoiceNotFoundException() {
		super();
	}
	
	public InvoiceNotFoundException(String customMessage) {
		super(customMessage);
	}
	
}


