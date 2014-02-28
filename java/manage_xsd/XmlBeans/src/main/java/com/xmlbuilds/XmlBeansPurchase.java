package com.xmlbuilds;

import java.io.File;

import org.apache.log4j.Logger;

import com.namespace.orderTypes.OrderType.Item;
import com.namespace.purchase.PurchaseDocument;

public class XmlBeansPurchase implements IXmlBeans {

	private static Logger logger = Logger.getLogger(XmlBeansPurchase.class);

	private String fileName;

	@Override
	public String getFileName() {
		return this.fileName;
	}

	@Override
	public void setFileName(String fileName) {
		this.fileName = System.getProperty("user.dir") + fileName;
	}

	@Override
	public void ReadFile() {

		try {
			File inputXMLFile = new File(fileName + ".xml");
			PurchaseDocument purchaseDocument = PurchaseDocument.Factory.parse(inputXMLFile);

			Item[] item = purchaseDocument.getPurchase().getOrderDetail().getItemArray();
			logger.debug("OrderDetail: " + item.length);
			for (Item i : item) {
				logger.debug("    ProductName : " + i.getProductName());
				logger.debug("    Quantity : " + i.getQuantity());
				logger.debug("    UnitPrice : " + i.getUnitPrice());
			}

			logger.debug("PaymentMethod : " + purchaseDocument.getPurchase().getPaymentMethod());

			logger.debug("PaymentMethod : " + purchaseDocument.getPurchase().getCustomerDetails().getName());

			logger.debug("Line1 : " + purchaseDocument.getPurchase().getCustomerDetails().getBillingAddress().getLine1());

			logger.debug("Line2 : " + purchaseDocument.getPurchase().getCustomerDetails().getBillingAddress().getLine2());

		} catch (Exception e) {
			logger.debug("Error! Exception caught");
			e.printStackTrace();
		}
	}

	@Override
	public void WriteFile() {
		// TODO Stub de la méthode généré automatiquement
		
	}
	
	@Override
	public String toString() {
		return "XmlBeansPurchase [fileName=" + fileName + "]";
	}

}
