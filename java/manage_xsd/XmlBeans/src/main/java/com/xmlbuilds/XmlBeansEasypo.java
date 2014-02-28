package com.xmlbuilds;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

import com.namespace.easypo.LineItem;
import com.namespace.easypo.PurchaseOrderDocument;

public class XmlBeansEasypo implements IXmlBeans {

	private static Logger logger = Logger.getLogger(XmlBeansEasypo.class);

	private String fileName;

	@Override
	public String getFileName() {
		return fileName;
	}

	@Override
	public void setFileName(String fileName) {
		this.fileName = System.getProperty("user.dir") + fileName;
	}

	@Override
	public void ReadFile() {
		// TODO Stub de la méthode généré automatiquement

	}

	@Override
	public void WriteFile() {

		File poXmlFile = new File(this.fileName + ".xml");

		PurchaseOrderDocument poDoc = null;

		try {
			poDoc = PurchaseOrderDocument.Factory.parse(poXmlFile);
		} catch (XmlException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		// Convert incoming data to types that can be used in accessors.
		BigDecimal perUnitOunces = new BigDecimal("20");
		BigDecimal itemPrice = new BigDecimal("10");
		BigInteger itemQuantity = new BigInteger("12");

		// Add the new <line-item> element.
		LineItem newItem = poDoc.getPurchaseOrder().addNewLineItem();
		newItem.setDescription("AZERTY");
		newItem.setPerUnitOunces(perUnitOunces);
		newItem.setPrice(itemPrice);
		newItem.setQuantity(itemQuantity);

		logger.debug("\n" + poDoc);
	}

	@Override
	public String toString() {
		return "XmlBeansEasypo [fileName=" + fileName + "]";
	}

}
