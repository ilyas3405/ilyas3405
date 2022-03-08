package com.example.SpringbootMVCCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.SpringbootMVCCRUD.entity.Invoice;
import com.example.SpringbootMVCCRUD.exception.InvoiceNotFoundException;
import com.example.SpringbootMVCCRUD.service.IInvoiceService;
import com.example.SpringbootMVCCRUD.service.impl.InvoiceServiceImpl;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

//	@Autowired
//	IInvoiceService service;

	IInvoiceService service = new InvoiceServiceImpl();

	@GetMapping("/")
	public String showHomePage() {
		return "homePage";
	}

	@GetMapping("/register")
	public String showRegistration() {
		return "registerInvoicePage";
	}

	@PostMapping("/save")
	public String saveInvoice(@ModelAttribute Invoice invoice, Model model) {
		service.saveInvoice(invoice);
		Long id = service.saveInvoice(invoice).getId();
		String message = "Record with id : '" + id + "' is saved successfully !";
		model.addAttribute("message", message);
		return "registerInvoicePage";

	}

	@GetMapping("/getAllInvoices")
	public String getAllInvoices(@RequestParam(value = "message", required = false) String message, Model model) {

		List<Invoice> invoices = service.getAllInvoices();
		model.addAttribute("list", invoices);
		model.addAttribute("message", message);
		return "allInvoicePage";
	}

	@GetMapping("/edit")
	public String getEditPage(Model model, RedirectAttributes attributes, @RequestParam Long id) {
		String page = null;
		try {

			Invoice invoice = service.getInvoiceById(id);
			model.addAttribute("invoice", invoice);
			page = "editInvoicePage";
		} catch (InvoiceNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:getAllowances";
		}
		return page;
	}

	 @PostMapping("/update")
	    public String updateInvoice(
	            @ModelAttribute Invoice invoice,
	            RedirectAttributes attributes
	            ) {
	       service.updateInvoice(invoice);
	       Long id = invoice.getId();
	       attributes.addAttribute("message", "Invoice with id: '"+id+"' is updated successfully !");
	       return "redirect:getAllInvoices";
	    }

	 @GetMapping("/delete")
	    public String deleteInvoice(
	            @RequestParam Long id,
	            RedirectAttributes attributes
	            ) {
	        try {
	        service.deleteInvoiceById(id);
	        attributes.addAttribute("message", "Invoice with Id : '"+id+"' is removed successfully!");
	        } catch (InvoiceNotFoundException e) {
	            e.printStackTrace();
	            attributes.addAttribute("message", e.getMessage());
	        }
	        return "redirect:getAllInvoices";
	    }
	 
}
