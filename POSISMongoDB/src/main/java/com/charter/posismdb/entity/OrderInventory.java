package com.charter.posismdb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ASN_REQUEST")
public class OrderInventory {

	public OrderInventory() {
	}

	public OrderInventory(String posTransactionId, String posASNDocumentId, String soapRequest, String asnmntContents) {
		super();

		this.posTransactionId = posTransactionId;
		this.posASNDocumentId = posASNDocumentId;
		this.soapRequest = soapRequest;
		this.asnmntContents = asnmntContents;
	}

	@Id
	private String id;

	private String posTransactionId;
	private String posASNDocumentId;
	private String soapRequest;
	private String asnmntContents;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosTransactionId() {
		return posTransactionId;
	}

	public void setPosTransactionId(String posTransactionId) {
		this.posTransactionId = posTransactionId;
	}

	public String getPosASNDocumentId() {
		return posASNDocumentId;
	}

	public void setPosASNDocumentId(String posASNDocumentId) {
		this.posASNDocumentId = posASNDocumentId;
	}

	public String getSoapRequest() {
		return soapRequest;
	}

	public void setSoapRequest(String soapRequest) {
		this.soapRequest = soapRequest;
	}

	public String getAsnmntContents() {
		return asnmntContents;
	}

	public void setAsnmntContents(String asnmntContents) {
		this.asnmntContents = asnmntContents;
	}

	@Override
	public String toString() {
		return String.format(
				"OrderInventory [id=%s, posTransactionId=%s, posASNDocumentId=%s, soapRequest=%s, asnmntContents=%s]",
				id, posTransactionId, posASNDocumentId, soapRequest, asnmntContents);
	}

}
