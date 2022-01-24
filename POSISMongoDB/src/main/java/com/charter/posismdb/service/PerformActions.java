package com.charter.posismdb.service;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.charter.posismdb.data.InventoryOrderRepository;
import com.charter.posismdb.data.RetailOrderRepository;
import com.charter.posismdb.entity.OrderInventory;
import com.charter.posismdb.entity.OrderRetail;

 
public class PerformActions {

	@Autowired
	private InventoryOrderRepository repositoryASN;

	@Autowired
	private RetailOrderRepository repositoryRetail;

	private OrderRetail retail1;

	public void DeleteAllASN() {
		repositoryASN.deleteAll();
	}

	public void SaveASN() {
		OrderInventory asn1;
		asn1 = new OrderInventory();
		asn1.setPosASNDocumentId("8387_DEV_02");
		asn1.setPosTransactionId("None");
		asn1.setAsnmntContents(
				"\"<Header target_org_node=\"STORE:8387\" download_name=\"Receiving.8387.8387_QA_09.031220201646\" download_time=\"IMMEDIATE\" apply_immediately=\"true\" />\n"
						+ "INSERT|INV_DOC|RECEIVING|ASN|8387|8387_QA_09||OPEN||||||HOME_OFFICE|8387_QA_09|2020-03-20||2020-03-15||FEDEX|8387_QA_09||8387|STORE 8387|||||||||||||||\n"
						+ "INSERT|CARTON|RECEIVING||8387|8387_QA_09|CARTON_8387||HOME_OFFICE|\n"
						+ "INSERT|INV_DOC_LINE_ITEM|RECEIVING||CARTON_8387|8387|8387_QA_09|1|OPEN|190198456700|10|||||||HOME_OFFICE|ITEM||||||||\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|1|222222200001646|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|2|222222200001647|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|3|222222200001648|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|4|222222200001649|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|5|222222200001650|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|6|222222200001651|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|7|222222200001652|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|8|222222200001653|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|9|222222200001654|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|1|10|222222200001655|\n"
						+ "INSERT|INV_DOC_LINE_ITEM|RECEIVING||CARTON_8387|8387|8387_QA_09|2|OPEN|191058105783|10|||||||HOME_OFFICE|ITEM||||||||\n"
						+ "INSERT|INV_DOC_LINE_ITEM|RECEIVING||CARTON_8387|8387|8387_QA_09|3|OPEN|888462313674|10|||||||HOME_OFFICE|ITEM||||||||\n"
						+ "INSERT|INV_DOC_LINE_ITEM|RECEIVING||CARTON_8387|8387|8387_QA_09|4|OPEN|887276300191|10|||||||HOME_OFFICE|ITEM||||||||\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|1|222222200001666|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|2|222222200001667|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|3|222222200001668|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|4|222222200001669|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|5|222222200001670|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|6|222222200001671|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|7|222222200001672|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|8|222222200001673|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|9|222222200001674|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|4|10|222222200001675|\n"
						+ "INSERT|INV_DOC_LINE_ITEM|RECEIVING||CARTON_8387|8387|8387_QA_09|5|OPEN|190198453709|10|||||||HOME_OFFICE|ITEM||||||||\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|1|222222200001656|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|2|222222200001657|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|3|222222200001658|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|4|222222200001659|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|5|222222200001660|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|6|222222200001661|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|7|222222200001662|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|8|222222200001663|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|9|222222200001664|\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8387|RECEIVING|8387_QA_09|5|10|222222200001665|\n"
						+ "INSERT|INV_DOC_LINE_ITEM|RECEIVING||CARTON_8387|8387|8387_QA_09|6|OPEN|191058105974|10|||||||HOME_OFFICE|ITEM||||||||\n"
						+ "\"");

		asn1.setSoapRequest("\"<order>\n" + "  <orderIdentifier>8387_QA_09</orderIdentifier>\n"
				+ "  <destinationRetailLocId>8387</destinationRetailLocId>\n"
				+ "  <statusOfShipment>SHIPPED</statusOfShipment>\n" + "  <cartonInfo>\n"
				+ "    <cartonId>CARTON_8387</cartonId>\n" + "    <lineItem>\n"
				+ "      <expectedItemCount>10</expectedItemCount>\n"
				+ "      <inventoryItemId>190198456700</inventoryItemId>\n" + "      <identifiers>\n"
				+ "        <serialNumber>\n" + "          <string>222222200001646</string>\n"
				+ "          <string>222222200001647</string>\n" + "          <string>222222200001648</string>\n"
				+ "          <string>222222200001649</string>\n" + "          <string>222222200001650</string>\n"
				+ "          <string>222222200001651</string>\n" + "          <string>222222200001652</string>\n"
				+ "          <string>222222200001653</string>\n" + "          <string>222222200001654</string>\n"
				+ "          <string>222222200001655</string>\n" + "        </serialNumber>\n"
				+ "      </identifiers>\n" + "      <itemName>Apple iPhone X 64GB Silver</itemName>\n"
				+ "      <itemPrice>799.99</itemPrice>\n" + "      <totalPrice>7999.9</totalPrice>\n"
				+ "    </lineItem>\n" + "    <lineItem>\n" + "      <expectedItemCount>10</expectedItemCount>\n"
				+ "      <inventoryItemId>191058105783</inventoryItemId>\n"
				+ "      <itemName>Incipio NGP Pure Case for iPhone 11 Black</itemName>\n"
				+ "      <itemPrice>19.99</itemPrice>\n" + "      <totalPrice>19.99</totalPrice>\n"
				+ "    </lineItem>\n" + "    <lineItem>\n" + "      <expectedItemCount>10</expectedItemCount>\n"
				+ "      <inventoryItemId>888462313674</inventoryItemId>\n"
				+ "      <itemName>Apple Apple Pencil (1st Generation) White</itemName>\n"
				+ "      <itemPrice>99.0</itemPrice>\n" + "      <totalPrice>99.0</totalPrice>\n" + "    </lineItem>\n"
				+ "    <lineItem>\n" + "      <expectedItemCount>10</expectedItemCount>\n"
				+ "      <inventoryItemId>887276300191</inventoryItemId>\n" + "      <identifiers>\n"
				+ "        <serialNumber>\n" + "          <string>222222200001666</string>\n"
				+ "          <string>222222200001667</string>\n" + "          <string>222222200001668</string>\n"
				+ "          <string>222222200001669</string>\n" + "          <string>222222200001670</string>\n"
				+ "          <string>222222200001671</string>\n" + "          <string>222222200001672</string>\n"
				+ "          <string>222222200001673</string>\n" + "          <string>222222200001674</string>\n"
				+ "          <string>222222200001675</string>\n" + "        </serialNumber>\n"
				+ "      </identifiers>\n" + "      <itemName>Samsung Galaxy S10e Prism Black 128GB</itemName>\n"
				+ "      <itemPrice>749.99</itemPrice>\n" + "      <totalPrice>7499.9</totalPrice>\n"
				+ "    </lineItem>\n" + "    <lineItem>\n" + "      <expectedItemCount>10</expectedItemCount>\n"
				+ "      <inventoryItemId>190198453709</inventoryItemId>\n" + "      <identifiers>\n"
				+ "        <serialNumber>\n" + "          <string>222222200001656</string>\n"
				+ "          <string>222222200001657</string>\n" + "          <string>222222200001658</string>\n"
				+ "          <string>222222200001659</string>\n" + "          <string>222222200001660</string>\n"
				+ "          <string>222222200001661</string>\n" + "          <string>222222200001662</string>\n"
				+ "          <string>222222200001663</string>\n" + "          <string>222222200001664</string>\n"
				+ "          <string>222222200001665</string>\n" + "        </serialNumber>\n"
				+ "      </identifiers>\n" + "      <itemName>Apple iPhone 8 Plus 64GB Silver</itemName>\n"
				+ "      <itemPrice>549.99</itemPrice>\n" + "      <totalPrice>5499.9</totalPrice>\n"
				+ "    </lineItem>\n" + "    <lineItem>\n" + "      <expectedItemCount>10</expectedItemCount>\n"
				+ "      <inventoryItemId>191058105974</inventoryItemId>\n"
				+ "      <itemName>Incipio NGP Pure Case for iPhone 11 Pro Max Black</itemName>\n"
				+ "      <itemPrice>19.99</itemPrice>\n" + "      <totalPrice>19.99</totalPrice>\n"
				+ "    </lineItem>\n" + "  </cartonInfo>\n" + "  <expShipDate>2020-03-12 16:46:14.897</expShipDate>\n"
				+ "  <expDeliveryDate>2020-03-15 16:46:14.897</expDeliveryDate>\n"
				+ "  <shippingCarrier>FEDEX</shippingCarrier>\n" + "  <trackingId>8387_QA_09</trackingId>\n"
				+ "  <destinationName>STORE 8387</destinationName>\n" + " </order>\")");
		repositoryASN.save(asn1);
		System.out.println("Completed Saving");

	}

	public void GetRetailOrder(String docid) {
		OrderRetail retail1 = repositoryRetail.findByposTransactionId(docid);
		System.out.println(retail1.getORIGINAL_SALE_REQUEST());
		
	}

	public void GetAllRetailOrder() {

		for (OrderRetail retail1 : repositoryRetail.findAll()) {
			System.out.println(retail1.getORIGINAL_SALE_REQUEST());
		}
	}

	public void DeleteAllRetailOrder() {
		repositoryRetail.deleteAll();
		// repositoryRetail.deleteById(id);
		System.out.println("Delete All Retail Completed");
	}

	public void SaveRetailOrder() {
		retail1 = new OrderRetail();
		retail1.setPosTransactionId("27758c74-78b1-4295-85bf-08802b28a58e_352424090231274");
		retail1.setST_RCVNG_MNT_DOC_SALE("");
		retail1.setST_SHPNG_MNT_DOC_RETURN(
				"<Header target_org_node=\"STORE:8000\" download_name=\"STORE_TRANSFER.1008.27758c74-78b1-4295-85bf-08802b28a58e_352424090231274.RETURN.050220190900_RETURNSHIPPING\" download_time=\"IMMEDIATE\" apply_immediately=\"true\" />\r\n"
						+ "INSERT|INV_DOC|SHIPPING|STORE_TRANSFER|8000|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274||CLOSED||||8000||HOME_OFFICE|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|2018-08-24||2018-08-24|||27758c74-78b1-4295-85bf-08802b28a58e_352424090231274||1008||||||||||||||||\r\n"
						+ "INSERT|CARTON|SHIPPING||8000|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|CLOSED|HOME_OFFICE|\r\n"
						+ "INSERT|INV_DOC_LINE_ITEM|SHIPPING||27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|8000|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|1|CLOSED|887276204222|1|||||SOLD||HOME_OFFICE|ITEM||||||||\r\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|8000|SHIPPING|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|1|1|352424090231274|\r\n"
						+ "INSERT|STOCK_LEDGER|8000|887276204222|SOLD|DEFAULT|||1|\r\n"
						+ "DELETE|INV_SERIALIZED_STOCK_LEDGER|8000|DEFAULT|SOLD|887276204222|352424090231274|");

		retail1.setST_RCVNG_MNT_DOC_RETURN(
				"\"<Header target_org_node=\"STORE:1008\" download_name=\"STORE_TRANSFER.1008.27758c74-78b1-4295-85bf-08802b28a58e_352424090231274.RETURN.050220190900_RETURNRECEIVING\" download_time=\"IMMEDIATE\" apply_immediately=\"true\" />\r\n"
						+ "INSERT|INV_DOC|RECEIVING|STORE_TRANSFER|1008|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274||CLOSED||||8000||HOME_OFFICE|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|2018-08-24||2018-08-24|||27758c74-78b1-4295-85bf-08802b28a58e_352424090231274||8000||||||||||||||||\r\n"
						+ "INSERT|CARTON|RECEIVING||1008|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|CLOSED|HOME_OFFICE|\r\n"
						+ "INSERT|INV_DOC_LINE_ITEM|RECEIVING||27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|1008|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|1|CLOSED|887276204222|1|||||DAMAGED||HOME_OFFICE|ITEM||||||||\r\n"
						+ "INSERT|INV_DOC_LINE_SERIAL|1008|RECEIVING|27758c74-78b1-4295-85bf-08802b28a58e_352424090231274|1|1|352424090231274|\r\n"
						+ "INSERT|STOCK_LEDGER|1008|887276204222|DAMAGED|DEFAULT|||1|\r\n"
						+ "INSERT|INV_SERIALIZED_STOCK_LEDGER|1008|DEFAULT|DAMAGED|887276204222|352424090231274|\r\n"
						+ "\"");
		retail1.setORIGINAL_SALE_REQUEST("\"<retailSale>\r\n" + "  <retailLocationId>1008</retailLocationId>\r\n"
				+ "  <transactionTimeStamp>2018-08-24 16:00:04.3</transactionTimeStamp>\r\n"
				+ "  <transactionId>27758c74-78b1-4295-85bf-08802b28a58e_352424090231274</transactionId>\r\n"
				+ "  <lineItem>\r\n" + "    <transactionType>RETURN</transactionType>\r\n"
				+ "    <inventoryItemId>887276204222</inventoryItemId>\r\n"
				+ "    <serialNumber>352424090231274</serialNumber>\r\n" + "    <salePrice>749.99</salePrice>\r\n"
				+ "  </lineItem>\r\n" + "</retailSale>\"");

		repositoryRetail.save(retail1);
		System.out.println("Retail sale saved!");

	}
}
