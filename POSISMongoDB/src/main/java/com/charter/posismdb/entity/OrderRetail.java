package com.charter.posismdb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RETAIL_REQUEST")
public class OrderRetail {
	@Id
	private String id;
	private String posTransactionId;
	private String ST_RCVNG_MNT_DOC_SALE;
	private String ST_SHPNG_MNT_DOC_RETURN;
	private String ST_RCVNG_MNT_DOC_RETURN;
	private String ORIGINAL_SALE_REQUEST;

	public OrderRetail() { }

	public String getST_RCVNG_MNT_DOC_SALE() {
		return ST_RCVNG_MNT_DOC_SALE;
	}

	public void setST_RCVNG_MNT_DOC_SALE(String sT_RCVNG_MNT_DOC_SALE) {
		ST_RCVNG_MNT_DOC_SALE = sT_RCVNG_MNT_DOC_SALE;
	}

	public String getST_SHPNG_MNT_DOC_RETURN() {
		return ST_SHPNG_MNT_DOC_RETURN;
	}

	public void setST_SHPNG_MNT_DOC_RETURN(String sT_SHPNG_MNT_DOC_RETURN) {
		ST_SHPNG_MNT_DOC_RETURN = sT_SHPNG_MNT_DOC_RETURN;
	}

	public String getST_RCVNG_MNT_DOC_RETURN() {
		return ST_RCVNG_MNT_DOC_RETURN;
	}

	public void setST_RCVNG_MNT_DOC_RETURN(String sT_RCVNG_MNT_DOC_RETURN) {
		ST_RCVNG_MNT_DOC_RETURN = sT_RCVNG_MNT_DOC_RETURN;
	}

	public String getORIGINAL_SALE_REQUEST() {
		return ORIGINAL_SALE_REQUEST;
	}

	public void setORIGINAL_SALE_REQUEST(String oRIGINAL_SALE_REQUEST) {
		ORIGINAL_SALE_REQUEST = oRIGINAL_SALE_REQUEST;
	}

	public String getPosTransactionId() {
		return posTransactionId;
	}

	public void setPosTransactionId(String posTransactionId) {
		this.posTransactionId = posTransactionId;
	}


}


